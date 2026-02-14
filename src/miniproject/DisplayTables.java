package miniproject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import miniproject.EmployeeFrame;

public class DisplayTables extends JFrame {
    private Connection conn;
    private JTabbedPane tabbedPane;

    public DisplayTables() {
        setTitle("Database Viewer - SKFARTS");
        setSize(1400, 800); // Bigger size
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Connect to Database
        connectToDatabase();

        // Heading Panel
        JPanel headingPanel = new JPanel(new BorderLayout());
        headingPanel.setBackground(new Color(173, 216, 230)); // Light Blue
        headingPanel.setPreferredSize(new Dimension(1400, 80));

        JLabel heading = new JLabel("RESOURCE RECORDS", JLabel.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 36));
        heading.setForeground(Color.BLACK);

        // Back Button
        JButton backButton = new JButton();
        backButton.setIcon(new ImageIcon("C:/Users/aaksh/Downloads/icons8-back-48.png")); // Provide your back button image path
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.addActionListener(e -> {
            this.dispose(); // Close the current frame
        EmployeeFrame m = new EmployeeFrame(); // Create instance of ManagerFrame
        m.setVisible(true); // Ensure this class exists in your project
             // Close the current frame
        });

        headingPanel.add(heading, BorderLayout.CENTER);
        headingPanel.add(backButton, BorderLayout.EAST);

        add(headingPanel, BorderLayout.NORTH);

        // Tabbed Pane
        tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Arial", Font.PLAIN, 20));
        tabbedPane.addTab("Machine", createTablePanel("SELECT * FROM machine"));
        tabbedPane.addTab("Scoring", createTablePanel("SELECT * FROM scoring"));
        tabbedPane.addTab("Laminating", createTablePanel("SELECT * FROM laminating"));
        tabbedPane.addTab("Design Type", createTablePanel("SELECT * FROM designtype"));
        tabbedPane.addTab("Designing", createTablePanel("SELECT * FROM designing"));

        // Big TabbedPane
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(tabbedPane, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        // Show Button
        JButton showButton = new JButton("Show All Records");
        showButton.setIcon(new ImageIcon("C:/Users/aaksh/Downloads/icons8-show-96.png")); // Provide your show button image path
        showButton.setFont(new Font("Arial", Font.BOLD, 20));
        showButton.setFocusPainted(false);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(224, 255, 255)); // Light color bottom
        bottomPanel.add(showButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Refresh Data on Show Button Click
        showButton.addActionListener(e -> refreshAllTabs());

        setVisible(true);
    }

    private void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SKFARTS?useSSL=false&allowPublicKeyRetrieval=true";
            String user = "root";
            String password = "Harini@05";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Connection Failed: " + e.getMessage());
        }
    }

    private JPanel createTablePanel(String sql) {
        JPanel panel = new JPanel(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        table.setRowHeight(25); // Bigger rows
        table.setFont(new Font("Arial", Font.PLAIN, 16));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData meta = rs.getMetaData();
            int colCount = meta.getColumnCount();

            model.setColumnCount(0);

            // Add Columns
            for (int i = 1; i <= colCount; i++) {
                model.addColumn(meta.getColumnName(i));
            }

            // Add Rows
            while (rs.next()) {
                Object[] rowData = new Object[colCount];
                for (int i = 1; i <= colCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);
        return panel;
    }

    private void refreshAllTabs() {
        tabbedPane.setComponentAt(0, createTablePanel("SELECT * FROM machine"));
        tabbedPane.setComponentAt(1, createTablePanel("SELECT * FROM scoring"));
        tabbedPane.setComponentAt(2, createTablePanel("SELECT * FROM laminating"));
        tabbedPane.setComponentAt(3, createTablePanel("SELECT * FROM designtype"));
        tabbedPane.setComponentAt(4, createTablePanel("SELECT * FROM designing"));
    }

    public static void main(String[] args) {
         new DisplayTables();
    }
}
