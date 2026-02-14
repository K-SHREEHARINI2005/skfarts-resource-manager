/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproject;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import miniproject.ManagerFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
/*
/**
 *
 * @author shreeharini
 */
public class JobsManage extends javax.swing.JFrame {
      private Jobs jobs;
    /**
     * Creates new form JobsManage
     */
    public JobsManage() {
         jobs = new Jobs();
        initComponents();
        showMachine();
        showScor();
         showLam();
         showDesign();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Heading = new javax.swing.JPanel();
        Headinglabel = new javax.swing.JLabel();
        Backbutt = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Macpanel = new javax.swing.JPanel();
        Macidlab = new javax.swing.JLabel();
        Macidtext = new javax.swing.JTextField();
        Macnamlab = new javax.swing.JLabel();
        Maccombo = new javax.swing.JComboBox<>();
        Typelabel = new javax.swing.JLabel();
        Typecombo = new javax.swing.JComboBox<>();
        Statlabel = new javax.swing.JLabel();
        Statcombo = new javax.swing.JComboBox<>();
        Ins1butt = new javax.swing.JButton();
        Del1butt = new javax.swing.JButton();
        Ed1butt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mactable1 = new javax.swing.JTable();
        Scorpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mactable2 = new javax.swing.JTable();
        Scorpanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Scorable = new javax.swing.JTable();
        Proidlab = new javax.swing.JLabel();
        Proidtext = new javax.swing.JTextField();
        Ins1butt2 = new javax.swing.JButton();
        Del1butt2 = new javax.swing.JButton();
        Ed2butt = new javax.swing.JButton();
        Scordatelab1 = new javax.swing.JLabel();
        Qtytext = new javax.swing.JTextField();
        Qtylabel = new javax.swing.JLabel();
        Scordatetext2 = new javax.swing.JTextField();
        Lamilabel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Lamtable = new javax.swing.JTable();
        Lamdalabel = new javax.swing.JLabel();
        Proidlabel = new javax.swing.JLabel();
        Macidtext1 = new javax.swing.JTextField();
        Macidlabel = new javax.swing.JLabel();
        Outputlabel = new javax.swing.JLabel();
        Ins3butt = new javax.swing.JButton();
        Del3butt = new javax.swing.JButton();
        Ed3butt = new javax.swing.JButton();
        Lamdatext = new javax.swing.JTextField();
        Proidtext1 = new javax.swing.JTextField();
        Outputtext = new javax.swing.JTextField();
        Desiglabel = new javax.swing.JPanel();
        Desidlabel = new javax.swing.JLabel();
        Desidtext = new javax.swing.JTextField();
        Softwarelab = new javax.swing.JLabel();
        Softwarecombo = new javax.swing.JComboBox<>();
        Creatdatlab = new javax.swing.JLabel();
        Credattext = new javax.swing.JTextField();
        Destylab = new javax.swing.JLabel();
        Pronamlab = new javax.swing.JLabel();
        Destyptext = new javax.swing.JTextField();
        Pojnamtext = new javax.swing.JTextField();
        Ins4butt = new javax.swing.JButton();
        Del4butt = new javax.swing.JButton();
        Ed4butt = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Desintabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Heading.setBackground(new java.awt.Color(102, 204, 255));

        Headinglabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Headinglabel.setText("JOBS MANAGEMENT ");

        Backbutt.setBackground(new java.awt.Color(51, 204, 255));
        Backbutt.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaksh\\Downloads\\icons8-back-48.png")); // NOI18N
        Backbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeadingLayout = new javax.swing.GroupLayout(Heading);
        Heading.setLayout(HeadingLayout);
        HeadingLayout.setHorizontalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Headinglabel)
                .addGap(140, 140, 140)
                .addComponent(Backbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeadingLayout.setVerticalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadingLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Headinglabel)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(HeadingLayout.createSequentialGroup()
                .addComponent(Backbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N

        Macpanel.setBackground(new java.awt.Color(255, 255, 255));

        Macidlab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Macidlab.setText("MACHINE ID");

        Macidtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Macidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacidtextActionPerformed(evt);
            }
        });

        Macnamlab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Macnamlab.setText("MACHINE NAME");

        Maccombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Maccombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offset-101", "LaserCut-X2", "BindPro-300", "FlexoFlex-80", "ColorJet-UV" }));
        Maccombo.setAutoscrolls(true);
        Maccombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Typelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Typelabel.setText("TYPE");

        Typecombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Typecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRINTING", "BINDING", "DESIGNING", "CUTTING", " " }));
        Typecombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Typecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypecomboActionPerformed(evt);
            }
        });

        Statlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Statlabel.setText("STATUS");

        Statcombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Statcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE", "INACTIVE", "MAINTENANCE" }));
        Statcombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Ins1butt.setBackground(new java.awt.Color(102, 204, 255));
        Ins1butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ins1butt.setText("INSERT");
        Ins1butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ins1butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins1buttActionPerformed(evt);
            }
        });

        Del1butt.setBackground(new java.awt.Color(51, 204, 255));
        Del1butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Del1butt.setText("DELETE");
        Del1butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Del1butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del1buttActionPerformed(evt);
            }
        });

        Ed1butt.setBackground(new java.awt.Color(51, 204, 255));
        Ed1butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ed1butt.setText("EDIT");
        Ed1butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ed1butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ed1buttActionPerformed(evt);
            }
        });

        Mactable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Mactable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Mactable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MACHINE ID", "MACHINE NAME", "TYPE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(Mactable1);
        if (Mactable1.getColumnModel().getColumnCount() > 0) {
            Mactable1.getColumnModel().getColumn(3).setHeaderValue("STATUS");
        }

        javax.swing.GroupLayout MacpanelLayout = new javax.swing.GroupLayout(Macpanel);
        Macpanel.setLayout(MacpanelLayout);
        MacpanelLayout.setHorizontalGroup(
            MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MacpanelLayout.createSequentialGroup()
                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MacpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MacpanelLayout.createSequentialGroup()
                                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Macidlab, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Macnamlab)
                                    .addComponent(Typelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Statlabel))
                                .addGap(30, 30, 30)
                                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Maccombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Typecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Statcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Macidtext)))
                            .addGroup(MacpanelLayout.createSequentialGroup()
                                .addComponent(Ins1butt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(Del1butt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MacpanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Ed1butt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        MacpanelLayout.setVerticalGroup(
            MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MacpanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Macidlab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Macidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Macnamlab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Maccombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Typelabel)
                    .addComponent(Typecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Statlabel)
                    .addComponent(Statcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(MacpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ins1butt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Del1butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Ed1butt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MacpanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("MACHINE", Macpanel);

        Mactable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Mactable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Mactable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "SCORING DATE", "OUTPUT QUANTITY"
            }
        ));
        jScrollPane2.setViewportView(Mactable2);

        Scorpanel1.setBackground(new java.awt.Color(255, 255, 255));

        Scorable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Scorable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Scorable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT  ID", "SCORING DATE", "OUTPUT QTY"
            }
        ));
        jScrollPane3.setViewportView(Scorable);

        Proidlab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Proidlab.setText("PRODUCT ID");

        Proidtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Proidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProidtextActionPerformed(evt);
            }
        });

        Ins1butt2.setBackground(new java.awt.Color(102, 204, 255));
        Ins1butt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ins1butt2.setText("INSERT");
        Ins1butt2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ins1butt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins1butt2ActionPerformed(evt);
            }
        });

        Del1butt2.setBackground(new java.awt.Color(51, 204, 255));
        Del1butt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Del1butt2.setText("DELETE");
        Del1butt2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Del1butt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del1butt2ActionPerformed(evt);
            }
        });

        Ed2butt.setBackground(new java.awt.Color(51, 204, 255));
        Ed2butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ed2butt.setText("EDIT");
        Ed2butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ed2butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ed2buttActionPerformed(evt);
            }
        });

        Scordatelab1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Scordatelab1.setText("SCORING DATE");

        Qtytext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Qtytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtytextActionPerformed(evt);
            }
        });

        Qtylabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Qtylabel.setText("OUTPUT QUANTITY");

        Scordatetext2.setForeground(new java.awt.Color(204, 204, 204));
        Scordatetext2.setText("  YYYY-MM-DD");
        Scordatetext2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Scordatetext2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Scordatetext2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Scordatetext2FocusLost(evt);
            }
        });
        Scordatetext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scordatetext2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Scorpanel1Layout = new javax.swing.GroupLayout(Scorpanel1);
        Scorpanel1.setLayout(Scorpanel1Layout);
        Scorpanel1Layout.setHorizontalGroup(
            Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scorpanel1Layout.createSequentialGroup()
                .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Scorpanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Scorpanel1Layout.createSequentialGroup()
                                .addComponent(Ins1butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Del1butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Scorpanel1Layout.createSequentialGroup()
                                .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Proidlab, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Scordatelab1)
                                    .addComponent(Qtylabel))
                                .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Scorpanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Qtytext, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Scorpanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Scordatetext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Proidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(Scorpanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Ed2butt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        Scorpanel1Layout.setVerticalGroup(
            Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scorpanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proidlab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Scorpanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Scordatelab1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Scorpanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scordatetext2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qtylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qtytext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Scorpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ins1butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Del1butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(Ed2butt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(Scorpanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ScorpanelLayout = new javax.swing.GroupLayout(Scorpanel);
        Scorpanel.setLayout(ScorpanelLayout);
        ScorpanelLayout.setHorizontalGroup(
            ScorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorpanelLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(ScorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ScorpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Scorpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ScorpanelLayout.setVerticalGroup(
            ScorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(ScorpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ScorpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Scorpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("SCORING", Scorpanel);

        Lamilabel.setBackground(new java.awt.Color(255, 255, 255));

        Lamtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Lamtable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lamtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LAMINATION ID", "PRODUCT ID", "MACHINE ID", "DATE", "OUTPUT QTY"
            }
        ));
        jScrollPane4.setViewportView(Lamtable);

        Lamdalabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lamdalabel.setText("LAMINATION DATE");

        Proidlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Proidlabel.setText("PRODUCT ID");

        Macidtext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Macidtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Macidtext1ActionPerformed(evt);
            }
        });

        Macidlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Macidlabel.setText("MACHINE ID");

        Outputlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Outputlabel.setText("OUTPUT QTY");

        Ins3butt.setBackground(new java.awt.Color(102, 204, 255));
        Ins3butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ins3butt.setText("INSERT");
        Ins3butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ins3butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins3buttActionPerformed(evt);
            }
        });

        Del3butt.setBackground(new java.awt.Color(51, 204, 255));
        Del3butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Del3butt.setText("DELETE");
        Del3butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Del3butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del3buttActionPerformed(evt);
            }
        });

        Ed3butt.setBackground(new java.awt.Color(51, 204, 255));
        Ed3butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ed3butt.setText("EDIT");
        Ed3butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ed3butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ed3buttActionPerformed(evt);
            }
        });

        Lamdatext.setForeground(new java.awt.Color(204, 204, 204));
        Lamdatext.setText("YYYY-MM-DD");
        Lamdatext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Lamdatext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LamdatextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LamdatextFocusLost(evt);
            }
        });
        Lamdatext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamdatextActionPerformed(evt);
            }
        });

        Proidtext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Proidtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proidtext1ActionPerformed(evt);
            }
        });

        Outputtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Outputtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LamilabelLayout = new javax.swing.GroupLayout(Lamilabel);
        Lamilabel.setLayout(LamilabelLayout);
        LamilabelLayout.setHorizontalGroup(
            LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LamilabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LamilabelLayout.createSequentialGroup()
                        .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LamilabelLayout.createSequentialGroup()
                                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Ins3butt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Outputlabel))
                                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(LamilabelLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(Del3butt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(LamilabelLayout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(Outputtext, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(LamilabelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(Ed3butt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LamilabelLayout.createSequentialGroup()
                        .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Proidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Macidlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Proidtext1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Macidtext1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LamilabelLayout.createSequentialGroup()
                        .addComponent(Lamdalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lamdatext, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        LamilabelLayout.setVerticalGroup(
            LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LamilabelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proidtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Macidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Macidtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lamdalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lamdatext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Outputlabel)
                    .addComponent(Outputtext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(LamilabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ins3butt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Del3butt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Ed3butt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(LamilabelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LAMINATION", Lamilabel);

        Desiglabel.setBackground(new java.awt.Color(255, 255, 255));

        Desidlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Desidlabel.setText("DESIGNING ID");

        Desidtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Desidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesidtextActionPerformed(evt);
            }
        });

        Softwarelab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Softwarelab.setText("SOFTWARE USED");

        Softwarecombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Softwarecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Photoshop", "Illustrator", "CorelDraw", "Canva" }));
        Softwarecombo.setAutoscrolls(true);
        Softwarecombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Creatdatlab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Creatdatlab.setText("CREATION DATE");

        Credattext.setForeground(new java.awt.Color(204, 204, 204));
        Credattext.setText("YYYY-MM-DD");
        Credattext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Credattext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CredattextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CredattextFocusLost(evt);
            }
        });
        Credattext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CredattextActionPerformed(evt);
            }
        });

        Destylab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Destylab.setText("DESIGNTYPE ID");

        Pronamlab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pronamlab.setText("PROJECT NAME");

        Destyptext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Destyptext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestyptextActionPerformed(evt);
            }
        });

        Pojnamtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Pojnamtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PojnamtextActionPerformed(evt);
            }
        });

        Ins4butt.setBackground(new java.awt.Color(102, 204, 255));
        Ins4butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ins4butt.setText("INSERT");
        Ins4butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ins4butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins4buttActionPerformed(evt);
            }
        });

        Del4butt.setBackground(new java.awt.Color(51, 204, 255));
        Del4butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Del4butt.setText("DELETE");
        Del4butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Del4butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del4buttActionPerformed(evt);
            }
        });

        Ed4butt.setBackground(new java.awt.Color(51, 204, 255));
        Ed4butt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ed4butt.setText("EDIT");
        Ed4butt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ed4butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ed4buttActionPerformed(evt);
            }
        });

        Desintabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESIGNING ID", "SOFTWARE USED", "PROJECT NAME", "CREATION DATE", "DESIGNTYPE ID"
            }
        ));
        jScrollPane5.setViewportView(Desintabel);

        javax.swing.GroupLayout DesiglabelLayout = new javax.swing.GroupLayout(Desiglabel);
        Desiglabel.setLayout(DesiglabelLayout);
        DesiglabelLayout.setHorizontalGroup(
            DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesiglabelLayout.createSequentialGroup()
                .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesiglabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Desidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Softwarelab)
                            .addComponent(Destylab)
                            .addComponent(Creatdatlab)
                            .addComponent(Pronamlab))
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesiglabelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Desidtext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Destyptext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Credattext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(DesiglabelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pojnamtext, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Softwarecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(DesiglabelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Ins4butt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Del4butt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesiglabelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(Ed4butt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );
        DesiglabelLayout.setVerticalGroup(
            DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesiglabelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesiglabelLayout.createSequentialGroup()
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Desidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Desidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Softwarelab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Softwarecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pronamlab, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pojnamtext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Creatdatlab, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Credattext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Destylab, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Destyptext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DesiglabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesiglabelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(Del4butt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesiglabelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ins4butt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ed4butt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DESIGNING", Desiglabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MacidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MacidtextActionPerformed

    private void TypecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypecomboActionPerformed

    private void Ins1buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins1buttActionPerformed
        // TODO add your handling code here:
    try {
    Connection conn = jobs.getConnection();
    String sql = "INSERT INTO machine (mid, name, type, status) VALUES (?, ?, ?, ?);";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, Macidtext.getText());  // ✅ Correct for VARCHAR
    ps.setString(2, Maccombo.getSelectedItem().toString());
    ps.setString(3, Typecombo.getSelectedItem().toString());
    ps.setString(4, Statcombo.getSelectedItem().toString());      
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null, "Machine added successfully!");
    showMachine();
   Proidtext .setText("");
   Macidtext.setText("");
   Maccombo.setSelectedIndex(0);
   Typecombo.setSelectedIndex(0);
   Statcombo.setSelectedIndex(0);
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}

    } 
private void showMachine() {
        try{
        Connection conn = jobs.getConnection();
        String sql = "SELECT * FROM machine";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) Mactable1.getModel();
        model.setRowCount(0); // Clear table first

        while (rs.next()) {
    model.addRow(new Object[]{
        rs.getString("mid"),          // Machine ID
        rs.getString("name"),      // Machine Name
        rs.getString("type"),      // Machine Type
        rs.getString("status")     // Machine Status
    });
}

     
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Display Error: " + e.getMessage());
    }
}

        private Connection getConnection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }//GEN-LAST:event_Ins1buttActionPerformed

    private void ProidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProidtextActionPerformed

    private void Ins1butt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins1butt2ActionPerformed

        // TODO add your handling code here:
        try {
            Connection conn = jobs.getConnection();
    String sql = "INSERT INTO scoring (rid, scoringdate, outputquantity) VALUES (?, ?, ?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, Integer.parseInt( Proidtext.getText()));  
    ps.setDate(2, java.sql.Date.valueOf(Scordatetext2.getText())); 
    ps.setInt(3, Integer.parseInt( Qtytext.getText())); 
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null, "Scoring details added successfully!");
    showScor();
   Proidtext .setText("");
   Scordatetext2 .setText("");
   Qtytext.setText("");
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}

    }//GEN-LAST:event_Ins1butt2ActionPerformed
private void showScor() {
        try{
        Connection conn = jobs.getConnection();
        String sql = "SELECT * FROM scoring";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) Scorable.getModel();
        model.setRowCount(0); 
        while (rs.next()) {
        model.addRow(new Object[]{
            rs.getInt("rid"),                
            rs.getDate("scoringdate"),        
            rs.getInt("outputquantity")      
        });
    }
}
 catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Display Error: " + e.getMessage());
    }
}
    private void QtytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtytextActionPerformed

    private void Scordatetext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scordatetext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scordatetext2ActionPerformed

    private void Macidtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Macidtext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Macidtext1ActionPerformed

    private void Ins3buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins3buttActionPerformed
        // TODO add your handling code here:
        try {
    Connection conn = jobs.getConnection();
    String sql = "INSERT INTO laminating (rid, mid, laminationdate, outputquantity) VALUES (?, ?, ?, ?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, Integer.parseInt( Proidtext1.getText())); 
    ps.setString(2, Macidtext1.getText());  // 
    ps.setDate(3, java.sql.Date.valueOf(Lamdatext.getText()));
    ps.setInt(4, Integer.parseInt( Outputtext.getText()));
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null, "Lamination details added successfully!");
    showLam();
   Proidtext1 .setText("");
   Macidtext1 .setText("");
   Lamdatext.setText("");
   Outputtext.setText("");
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }//GEN-LAST:event_Ins3buttActionPerformed
private void showLam() {
    try {
        Connection conn = jobs.getConnection();
        String sql = "SELECT id, rid, mid, laminationdate, outputquantity FROM laminating";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        DefaultTableModel model = (DefaultTableModel) Lamtable.getModel();
        model.setRowCount(0); // Clear table first
        while (rs.next()) {
            System.out.println("MID: " + rs.getString("mid"));  // Debug print
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getInt("rid"),
                rs.getString("mid"),
                rs.getDate("laminationdate"),
                rs.getInt("outputquantity")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Display Error: " + e.getMessage());
    }
}

    private void LamdatextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamdatextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LamdatextActionPerformed

    private void Proidtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proidtext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Proidtext1ActionPerformed

    private void OutputtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutputtextActionPerformed

    private void DesidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesidtextActionPerformed

    private void CredattextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CredattextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CredattextActionPerformed

    private void DestyptextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestyptextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestyptextActionPerformed

    private void PojnamtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PojnamtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PojnamtextActionPerformed

    private void Ins4buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins4buttActionPerformed
        // TODO add your handling code here:
        try {
        Connection conn = jobs.getConnection();
        String sql = "INSERT INTO designing (did, softwareused, projectname, creationdate, designtypeid) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        // Get values from text fields and combo box
        ps.setInt(1, Integer.parseInt(Desidtext.getText())); // did
        ps.setString(2,Softwarecombo.getSelectedItem().toString()); // softwareused from combo box
        ps.setString(3, Pojnamtext.getText()); // projectname
        ps.setDate(4, java.sql.Date.valueOf(Credattext.getText()));// creationdate (format: yyyy-MM-dd)
        ps.setInt(5, Integer.parseInt(Destyptext.getText())); // designtypeid

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Design record added successfully!");
        showDesign(); // your display method
       
        // Clear the fields
        Desidtext.setText("");
        Pojnamtext.setText("");
        Credattext.setText("");
        Destyptext.setText("");
        Softwarecombo.setSelectedIndex(0);
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_Ins4buttActionPerformed
private void showDesign() {
    try {
        Connection conn = jobs.getConnection();
        String sql = "SELECT * FROM designing";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) Desintabel.getModel();
        model.setRowCount(0); // Clear table

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("did"),
                rs.getString("softwareused"),
                rs.getString("projectname"),
                rs.getDate("creationdate"),
                rs.getInt("designtypeid")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Display Error: " + e.getMessage());
    }
}

    private void BackbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttActionPerformed
        // TODO add your handling code here:
            ManagerFrame m = new ManagerFrame(); // Create instance of ManagerFrame
            m.setVisible(true);
            
            this.dispose();
    }//GEN-LAST:event_BackbuttActionPerformed

    private void Del1buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del1buttActionPerformed
        // TODO add your handling code here:
        try {
        String machineIdInput = JOptionPane.showInputDialog(null, "Enter Machine ID to Delete:");

        if (machineIdInput != null && !machineIdInput.trim().isEmpty()) {
            Connection conn = jobs.getConnection();
            String sql = "DELETE FROM machine WHERE mid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, machineIdInput);  // ✅ Take ID from dialog box
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                showMachine(); // Refresh table
            } else {
                JOptionPane.showMessageDialog(null, "Machine ID not found. Deletion failed.");
            }

            // Clear fields
            Macidtext.setText("");
            Maccombo.setSelectedIndex(0);
            Typecombo.setSelectedIndex(0);
            Statcombo.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Machine ID is required to delete.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Delete Error: " + e.getMessage());
    }                
    }//GEN-LAST:event_Del1buttActionPerformed

    private String updateMachineId = null; 
    private void Ed1buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ed1buttActionPerformed
        // TODO add your handling code here:
      try {
        if (updateMachineId == null) {
            // Step 1: Fetch machine details
            String machineIdInput = JOptionPane.showInputDialog(null, "Enter Machine ID to Update:");

            if (machineIdInput != null && !machineIdInput.trim().isEmpty()) {
                Connection conn = jobs.getConnection();
                String selectSql = "SELECT name, type, status FROM machine WHERE mid=?";
                PreparedStatement selectStmt = conn.prepareStatement(selectSql);
                selectStmt.setString(1, machineIdInput);
                ResultSet rs = selectStmt.executeQuery();

                if (rs.next()) {
                    // Set fetched values into fields
                    Macidtext.setText(machineIdInput); // Machine ID
                    Maccombo.setSelectedItem(rs.getString("name"));
                    Typecombo.setSelectedItem(rs.getString("type"));
                    Statcombo.setSelectedItem(rs.getString("status"));

                    updateMachineId = machineIdInput; // Store for update
                    JOptionPane.showMessageDialog(null, "Machine details loaded.\nEdit fields and click UPDATE again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Machine ID not found.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Machine ID is required.");
            }
        } else {
            // Step 2: Update machine details
            Connection conn = jobs.getConnection();
            String sql = "UPDATE machine SET name=?, type=?, status=? WHERE mid=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Maccombo.getSelectedItem().toString());
            ps.setString(2, Typecombo.getSelectedItem().toString());
            ps.setString(3, Statcombo.getSelectedItem().toString());
            ps.setString(4, updateMachineId);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Machine details updated successfully!");
                showMachine(); // Refresh table

                // Clear fields
                Proidtext.setText("");
                Macidtext.setText("");
                Maccombo.setSelectedIndex(0);
                Typecombo.setSelectedIndex(0);
                Statcombo.setSelectedIndex(0);

                updateMachineId = null; // Reset after update
            } else {
                JOptionPane.showMessageDialog(null, "Update Failed");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_Ed1buttActionPerformed

    private void Del1butt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del1butt2ActionPerformed
         try {
        String resourceIdInput = JOptionPane.showInputDialog(null, "Enter Resource ID to Delete:");

        if (resourceIdInput != null && !resourceIdInput.trim().isEmpty()) {
            Connection conn = jobs.getConnection();
            String sql = "DELETE FROM scoring WHERE rid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(resourceIdInput)); // ✅ From input dialog
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                showScor(); // Refresh table
            } else {
                JOptionPane.showMessageDialog(null, "Resource ID not found. Deletion failed.");
            }

            // Clear fields
            Proidtext.setText("");
            Scordatetext2.setText("");
            Qtytext.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Resource ID is required to delete.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Delete Error: " + e.getMessage());
    }    
    }//GEN-LAST:event_Del1butt2ActionPerformed

    private void Ed2buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ed2buttActionPerformed
        // TODO add your handling code here:
        try {
        if (Proidtext.getText().trim().isEmpty()) {
            String ridInput = JOptionPane.showInputDialog(null, "Enter Resource ID to Update:");
            if (ridInput != null && !ridInput.trim().isEmpty()) {
                Connection conn = jobs.getConnection();
                String sql = "SELECT scoringdate, outputquantity FROM scoring WHERE rid=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(ridInput));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    Proidtext.setText(ridInput); // Set rid
                    Scordatetext2.setText(rs.getDate("scoringdate").toString());
                    Qtytext.setText(String.valueOf(rs.getInt("outputquantity")));
                    JOptionPane.showMessageDialog(null, "Now edit the fields and click Edit again to save changes.");
                } else {
                    JOptionPane.showMessageDialog(null, "Resource ID not found.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Resource ID is required.");
            }
        } else {
            // Now update the modified values
            Connection conn = jobs.getConnection();
            String sql = "UPDATE scoring SET scoringdate=?, outputquantity=? WHERE rid=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDate(1, java.sql.Date.valueOf(Scordatetext2.getText()));
            ps.setInt(2, Integer.parseInt(Qtytext.getText()));
            ps.setInt(3, Integer.parseInt(Proidtext.getText()));

            int rows = ps.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Scoring details updated successfully!");
                showScor(); // Refresh JTable
            } else {
                JOptionPane.showMessageDialog(null, "No matching record found to update.");
            }

            Proidtext.setText("");
            Scordatetext2.setText("");
            Qtytext.setText("");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_Ed2buttActionPerformed

    private void Del3buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del3buttActionPerformed
        // TODO add your handling code here:
        try {
        // Prompt the user for the Employee ID
        String input = JOptionPane.showInputDialog(this, "Enter Laminating ID to delete:");
        
        // If the user cancels or inputs nothing
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deletion cancelled or no ID entered.");
            return;
        }
        int lamId = Integer.parseInt(input.trim());
        Connection conn = jobs.getConnection();  // Your DB connection method
        String sql = "DELETE FROM laminating WHERE id=?";
        PreparedStatement pt = conn.prepareStatement(sql);
        pt.setInt(1, lamId);
        int rowsAffected = pt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Lamination details  Deleted Successfully");
            showLam(); 
        } else {
            JOptionPane.showMessageDialog(this, "Lamination  ID not found");
        }
         Proidtext1 .setText("");
         Macidtext1 .setText("");
         Lamdatext.setText("");
         Outputtext.setText("");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid ID. Please enter a valid number.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Delete Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_Del3buttActionPerformed

    private void Ed3buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ed3buttActionPerformed
        // TODO add your handling code here:                                       
    try {
        if (Proidtext1.getText().trim().isEmpty()) {
            // If textfields are empty, ask for ID and load data
            String lamIdInput = JOptionPane.showInputDialog(null, "Enter Lamination ID to Update:");
            if (lamIdInput != null && !lamIdInput.trim().isEmpty()) {
                Connection conn = jobs.getConnection();
                String sql = "SELECT rid, mid, laminationdate, outputquantity FROM laminating WHERE id=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(lamIdInput));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    Proidtext1.setText(String.valueOf(rs.getInt("rid")));
                    Macidtext1.setText(rs.getString("mid"));
                    Lamdatext.setText(rs.getDate("laminationdate").toString());
                    Outputtext.setText(String.valueOf(rs.getInt("outputquantity")));
                    JOptionPane.showMessageDialog(null, "Now edit the fields and click Edit again to save changes.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lamination ID not found.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lamination ID is required.");
            }
        } else {
            // If already loaded and user clicked Edit again -> update the data
            Connection conn = jobs.getConnection();
            String sql = "UPDATE laminating SET rid=?, mid=?, laminationdate=?, outputquantity=? WHERE id=?";
            PreparedStatement pt = conn.prepareStatement(sql);

            pt.setInt(1, Integer.parseInt(Proidtext1.getText()));
            pt.setString(2, Macidtext1.getText());
            pt.setDate(3, java.sql.Date.valueOf(Lamdatext.getText()));
            pt.setInt(4, Integer.parseInt(Outputtext.getText()));
            pt.setInt(5, Integer.parseInt(Proidtext1.getText())); // Here Proidtext1 holds the ID now

            int rowsAffected = pt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Lamination Updated Successfully");
                showLam(); // Refresh table
            } else {
                JOptionPane.showMessageDialog(null, "No matching record found to update.");
            }

            // Clear fields
            Proidtext1.setText("");
            Macidtext1.setText("");
            Lamdatext.setText("");
            Outputtext.setText("");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid format. Please enter valid numbers.");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Update Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_Ed3buttActionPerformed

    private void Del4buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del4buttActionPerformed

        try {
        // Prompt the user for the Design ID
        String input = JOptionPane.showInputDialog(this, "Enter Design ID to delete:");
        
        // If the user cancels or inputs nothing
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deletion cancelled or no ID entered.");
            return;
        }
        
        int designId = Integer.parseInt(input.trim());
        Connection conn = jobs.getConnection();  // Your DB connection method
        String sql = "DELETE FROM designing WHERE did=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, designId);
        
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Design record deleted successfully!");
            showDesign(); // Refresh table
        } else {
            JOptionPane.showMessageDialog(this, "Design ID not found");
        }
        
        // Clear the text fields after deletion
        Desidtext.setText("");
        Pojnamtext.setText("");
        Credattext.setText("");
        Destyptext.setText("");
        Softwarecombo.setSelectedIndex(0);

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid ID. Please enter a valid number.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Delete Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_Del4buttActionPerformed

    private void Ed4buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ed4buttActionPerformed
        // TODO add your handling code here:
        try {
        if (Desidtext.getText().trim().isEmpty()) {
            // If textfields are empty, ask for ID and load data
            String designIdInput = JOptionPane.showInputDialog(null, "Enter Design ID to Update:");
            if (designIdInput != null && !designIdInput.trim().isEmpty()) {
                Connection conn = jobs.getConnection();
                String sql = "SELECT softwareused, projectname, creationdate, designtypeid FROM designing WHERE did=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(designIdInput));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    Softwarecombo.setSelectedItem(rs.getString("softwareused"));
                    Pojnamtext.setText(rs.getString("projectname"));
                    Credattext.setText(rs.getDate("creationdate").toString());
                    Destyptext.setText(String.valueOf(rs.getInt("designtypeid")));
                    JOptionPane.showMessageDialog(null, "Now edit the fields and click Edit again to save changes.");
                } else {
                    JOptionPane.showMessageDialog(null, "Design ID not found.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Design ID is required.");
            }
        } else {
            // If already loaded and user clicked Edit again -> update the data
            Connection conn = jobs.getConnection();
            String sql = "UPDATE designing SET softwareused=?, projectname=?, creationdate=?, designtypeid=? WHERE did=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            // Setting parameters from text fields and combo box
            ps.setString(1, Softwarecombo.getSelectedItem().toString()); // softwareused
            ps.setString(2, Pojnamtext.getText()); // projectname
            ps.setDate(3, java.sql.Date.valueOf(Credattext.getText())); // creationdate (yyyy-mm-dd)
            ps.setInt(4, Integer.parseInt(Destyptext.getText())); // designtypeid
            ps.setInt(5, Integer.parseInt(Desidtext.getText())); // did (Design ID)

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Design record updated successfully!");
                showDesign(); // Refresh the table display
            } else {
                JOptionPane.showMessageDialog(null, "No matching record found to update.");
            }

            // Clear fields
            Desidtext.setText("");
            Pojnamtext.setText("");
            Credattext.setText("");
            Destyptext.setText("");
            Softwarecombo.setSelectedIndex(0);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Update Error: " + e.getMessage());
    }
    }//GEN-LAST:event_Ed4buttActionPerformed

    private void Scordatetext2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Scordatetext2FocusGained
        // TODO add your handling code here:
        if(Scordatetext2.getText().equals("  YYYY-MM-DD")) {
        Scordatetext2.setText(""); // Clear the default text
        Scordatetext2.setForeground(Color.BLACK); // Set text color to black
    }

    }//GEN-LAST:event_Scordatetext2FocusGained

    private void Scordatetext2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Scordatetext2FocusLost
        // TODO add your handling code here:
          if(Scordatetext2.getText().isEmpty()){
            Scordatetext2.setText("  YYYY-MM-DD");
            Scordatetext2.setForeground(Color.GRAY);
          }
    }//GEN-LAST:event_Scordatetext2FocusLost

    private void LamdatextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LamdatextFocusGained
        // TODO add your handling code here:
          if(Lamdatext.getText().equals("YYYY-MM-DD")){
            Lamdatext.setText("");
            Lamdatext.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_LamdatextFocusGained

    private void LamdatextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LamdatextFocusLost
        // TODO add your handling code here:
        if(Lamdatext.getText().isEmpty()){
            Lamdatext.setText("YYYY-MM-DD");
            Lamdatext.setForeground(Color.GRAY);}

    }//GEN-LAST:event_LamdatextFocusLost

    private void CredattextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CredattextFocusGained
        // TODO add your handling code here:
        if(Credattext.getText().equals("YYYY-MM-DD")){
            Credattext.setText("");
            Credattext.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_CredattextFocusGained

    private void CredattextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CredattextFocusLost
        // TODO add your handling code here:
        if(Credattext.getText().isEmpty()){
            Credattext.setText("YYYY-MM-DD");
            Credattext.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_CredattextFocusLost
    /**
     * @param args the command line arguments
     */
    public class Jobs{
        private Connection conn ;
        public Jobs(){
             connectToDatabase();
        }    
    public void connectToDatabase() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // String url = "jdbc:mysql://localhost:3306/?user"; 
            String url = "jdbc:mysql://localhost:3306/SKFARTS?useSSL=false&allowPublicKeyRetrieval=true";  
            String user = "root"; 
            String password = "Harini@05";  

           
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");
            JOptionPane.showMessageDialog(null, "Database connected successfully!");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed!\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return conn;
    }
 }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JobsManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JobsManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JobsManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JobsManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JobsManage().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbutt;
    private javax.swing.JLabel Creatdatlab;
    private javax.swing.JTextField Credattext;
    private javax.swing.JButton Del1butt;
    private javax.swing.JButton Del1butt2;
    private javax.swing.JButton Del3butt;
    private javax.swing.JButton Del4butt;
    private javax.swing.JLabel Desidlabel;
    private javax.swing.JTextField Desidtext;
    private javax.swing.JPanel Desiglabel;
    private javax.swing.JTable Desintabel;
    private javax.swing.JLabel Destylab;
    private javax.swing.JTextField Destyptext;
    private javax.swing.JButton Ed1butt;
    private javax.swing.JButton Ed2butt;
    private javax.swing.JButton Ed3butt;
    private javax.swing.JButton Ed4butt;
    private javax.swing.JPanel Heading;
    private javax.swing.JLabel Headinglabel;
    private javax.swing.JButton Ins1butt;
    private javax.swing.JButton Ins1butt2;
    private javax.swing.JButton Ins3butt;
    private javax.swing.JButton Ins4butt;
    private javax.swing.JLabel Lamdalabel;
    private javax.swing.JTextField Lamdatext;
    private javax.swing.JPanel Lamilabel;
    private javax.swing.JTable Lamtable;
    private javax.swing.JComboBox<String> Maccombo;
    private javax.swing.JLabel Macidlab;
    private javax.swing.JLabel Macidlabel;
    private javax.swing.JTextField Macidtext;
    private javax.swing.JTextField Macidtext1;
    private javax.swing.JLabel Macnamlab;
    private javax.swing.JPanel Macpanel;
    private javax.swing.JTable Mactable1;
    private javax.swing.JTable Mactable2;
    private javax.swing.JLabel Outputlabel;
    private javax.swing.JTextField Outputtext;
    private javax.swing.JTextField Pojnamtext;
    private javax.swing.JLabel Proidlab;
    private javax.swing.JLabel Proidlabel;
    private javax.swing.JTextField Proidtext;
    private javax.swing.JTextField Proidtext1;
    private javax.swing.JLabel Pronamlab;
    private javax.swing.JLabel Qtylabel;
    private javax.swing.JTextField Qtytext;
    private javax.swing.JTable Scorable;
    private javax.swing.JLabel Scordatelab1;
    private javax.swing.JTextField Scordatetext2;
    private javax.swing.JPanel Scorpanel;
    private javax.swing.JPanel Scorpanel1;
    private javax.swing.JComboBox<String> Softwarecombo;
    private javax.swing.JLabel Softwarelab;
    private javax.swing.JComboBox<String> Statcombo;
    private javax.swing.JLabel Statlabel;
    private javax.swing.JComboBox<String> Typecombo;
    private javax.swing.JLabel Typelabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
