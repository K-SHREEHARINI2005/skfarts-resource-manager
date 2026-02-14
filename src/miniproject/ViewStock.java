package miniproject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ViewStock extends JFrame {
    JButton showButton, backButton;
    JTable stockTable;
    DefaultTableModel model;
    public ViewStock() {
        setTitle("View Low Stock Resources");
        setSize(800, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create header panel with light blue background
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(173, 216, 230));  // Light Blue color
        headerPanel.setLayout(new BorderLayout()); // Using BorderLayout for precise control

        // Title Label (Centered)
        JLabel titleLabel = new JLabel("View Stock");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));  // Set font for the title
        titleLabel.setForeground(Color.BLACK); // Set text color for the title
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);  // Center the text
        headerPanel.add(titleLabel, BorderLayout.CENTER);  // Add title in the center of the header panel

        // Back button (Aligned to top right)
        backButton = new JButton();
        ImageIcon backIcon = new ImageIcon("C:/Users/aaksh/Downloads/icons8-back-48.png"); // Add path to your Back button image
        backButton.setIcon(backIcon);
        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Align the back button to the right
        backButtonPanel.setOpaque(false); // Set the panel to be transparent
        backButtonPanel.add(backButton);  // Add back button to the panel
        headerPanel.add(backButtonPanel, BorderLayout.NORTH);  // Add the panel with back button to the top of the header panel

        // Add header panel to the top of the frame
        add(headerPanel, BorderLayout.NORTH);

        // Table setup
        model = new DefaultTableModel();
        stockTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(stockTable);
        add(scrollPane, BorderLayout.CENTER);

        // Bottom panel with Show button
        JPanel bottomPanel = new JPanel();
        showButton = new JButton();
        ImageIcon showIcon = new ImageIcon("C:/Users/aaksh/Downloads/icons8-show-96.png"); // Add path to your Show button image
        showButton.setIcon(showIcon);
        bottomPanel.add(showButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Table columns (removed "Supplier Contact")
        model.addColumn("Resource ID");
        model.addColumn("Resource Name");
        model.addColumn("Quantity");
        model.addColumn("Supplier Name");
        model.addColumn("Error Message");
        model.addColumn("Order Details");

        // Back button action
        backButton.addActionListener(e -> {
            dispose();
            EmployeeFrame m = new EmployeeFrame(); // Create instance of EmployeeFrame
            m.setVisible(true); // Opens EmployeeFrame
        });

        // Show button action
        showButton.addActionListener(e -> loadData());

        setVisible(true);
    }

    private void loadData() {
        model.setRowCount(0); // Clear existing table rows

        try {
            // Establish database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection( 
                "jdbc:mysql://localhost:3306/SKFARTS", "root", "Harini@05"
            );

            // Prepare and call the stored procedure
            CallableStatement cs = con.prepareCall("{CALL GetLowStockResources()}");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("rid"),
                    rs.getString("rname"),
                    rs.getInt("rquantity"),
                    rs.getString("sname"),
                    rs.getString("error_message"),
                    rs.getString("order_details")
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ViewStock();
    }
}
