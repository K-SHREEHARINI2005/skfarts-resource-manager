package miniproject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class ViewStockFrame extends JFrame {
    JButton showButton, backButton, mailButton;
    JTable stockTable;
    DefaultTableModel model;
    public ViewStockFrame() {
        setTitle("View Low Stock Resources");
        setSize(800, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(173, 216, 230));
        headerPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("View Stock");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        // Back button
        backButton = new JButton();
        ImageIcon backIcon = new ImageIcon("C:/Users/aaksh/Downloads/icons8-back-48.png");
        backButton.setIcon(backIcon);
        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        backButtonPanel.setOpaque(false);
        backButtonPanel.add(backButton);
        headerPanel.add(backButtonPanel, BorderLayout.NORTH);
        add(headerPanel, BorderLayout.NORTH);
        // Table setup
        model = new DefaultTableModel();
        stockTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(stockTable);
        add(scrollPane, BorderLayout.CENTER);

        // Bottom panel with Show and Email buttons
        JPanel bottomPanel = new JPanel();
        showButton = new JButton();
        ImageIcon showIcon = new ImageIcon("C:/Users/aaksh/Downloads/icons8-show-96.png");
        showButton.setIcon(showIcon);
        bottomPanel.add(showButton);
        mailButton = new JButton();
        ImageIcon mailIcon = new ImageIcon("C:/Users/aaksh/Downloads/icons8-mail-48.png");
        mailButton.setIcon(mailIcon);
        bottomPanel.add(mailButton);
        add(bottomPanel, BorderLayout.SOUTH);
        // Table columns
        model.addColumn("Resource ID");
        model.addColumn("Resource Name");
        model.addColumn("Quantity");
        model.addColumn("Supplier Name");
        model.addColumn("Contact");
        model.addColumn("Error Message");
        model.addColumn("Order Details");
        // Button actions
        backButton.addActionListener(e -> {
            dispose();
            ManagerFrame m = new ManagerFrame();
            m.setVisible(true);
        });
        showButton.addActionListener(e -> loadData());
        mailButton.addActionListener(e -> {
            int selectedRow = stockTable.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to send email.");
                return;
            }
            String email = JOptionPane.showInputDialog(this, "Enter Supplier Email:");
            if (email == null || email.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email not provided.");
                return;
            }
            String supplierName = model.getValueAt(selectedRow, 3).toString();
            String productName = model.getValueAt(selectedRow, 1).toString();
            String quantity = model.getValueAt(selectedRow, 2).toString();

            sendOrderEmail(email, supplierName, productName, quantity);
        });

        setVisible(true);
    }

    private void loadData() {
        model.setRowCount(0); // Clear existing rows

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/SKFARTS", "root", "Harini@05"
            );

            CallableStatement cs = con.prepareCall("{CALL GetLowStockResources()}");
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("rid"),
                        rs.getString("rname"),
                        rs.getInt("rquantity"),
                        rs.getString("sname"),
                        rs.getString("contact"),
                        rs.getString("error_message"),
                        rs.getString("order_details")
                });
            }

            rs.close();
            cs.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    public void sendOrderEmail(String recipientEmail, String supplierName, String productName, String quantity) {
        String fromEmail = "skfarts1980@gmail.com";
        String password = "myld wqfl ncxs sqrx";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Stock Order Request");

            String body = "I hope this message finds you well." +
                    "We would like to inform you that the stock supplies has reached a critical low level."+"\n"+"As of today, the remaining quantity is below the minimum threshold, and we kindly request you to arrange for a prompt restocking.\n\n" +
                    "Product: " + productName + "\n" +
                    "Required Quantity: " + quantity + "\n\n" +
                    "Please confirm the earliest possible delivery date. Your timely support will help us avoid any disruptions.\n\n" +
                    "Thank you for your prompt attention"+"\n"+"Best regards,"+"\n"+"Shree Kesavan Fine Arts,"+"\n"+"skfarts1980@gmail.com,"+"\n"+"7708694544";

            message.setText(body);
            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Email sent successfully to supplier!");
        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to send email: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ViewStockFrame();
    }
}
