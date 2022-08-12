/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_bsit1b_it04_jqjz;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmdb extends javax.swing.JFrame {

    /**
     * Creates new form frmdb
     */
    
    //default border for menu items
    Border default_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(235,218,204));
    
    //brown border for menu items
    Border brown_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(235,218,204));
    
    Border white_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(255,255,255));
    
    //create an array of jLabel
    JLabel[] menuLabels = new JLabel[8];
    
    JPanel[] panels = new JPanel[8];
    
    
    
    public frmdb() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        //set borders
        //default border for menu items
    Border default_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(235,218,204));
    
    //brown border for menu items
    Border white_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(255,255,255));
    
    
    //populate the menuLabels array
    menuLabels[0] = jLabel_menuitem1;
    menuLabels[1] = jLabel_menuitem2;
    menuLabels[2] = jLabel_menuitem3;
    menuLabels[3] = jLabel_menuitem4;
    menuLabels[4] = jLabel_menuitem5;
    menuLabels[5] = jLabel_menuitem6;
    menuLabels[6] = jLabel_menuitem7;
    menuLabels[7] = jLabel_menuitem8;
    
    //populate the Panels array
    panels[0] = jPaneldb;
    panels[1] = jPanelemp;
    panels[2] = jPaneldept;
    panels[3] = jPaneltrain;
    panels[4] = jPanelvacay;
    panels[5] = jPanelsal;
    panels[6] = jPanelatt;
    panels[7] = jPaneleval;
    
    
    
    
    addActionToMenuLabels();
    }
    
    public void setLabelBackground(JLabel label){
        
        for (JLabel menuitem : menuLabels) {
         menuitem.setBackground(new Color(235,218,204));
         menuitem.setForeground(new Color(178,120,74));
        }
 
         label.setBackground(new Color(235,218,204));
         label.setForeground(Color.black);
    }
    
    public void showPanel(JPanel panel){
        for (JPanel pnl : panels) {
            pnl.setVisible(false);
        }
        panel.setVisible(true);
    }
    
    public void addActionToMenuLabels(){
        Component[] components = jpanelmenu.getComponents();
        
        for (Component component : components) {
            if(component instanceof JLabel){
                JLabel label = (JLabel) component;
                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        
                        setLabelBackground(label);
                        
                        switch (label.getText().trim()){
                            case "DASHBOARD":
                                    showPanel(jPaneldb);
                                    break;
                            case "EMPLOYEE":
                                    showPanel(jPanelemp);
                                    break;
                            case "DEPARTMENT":
                                    showPanel(jPaneldept);
                                    break;
                            case "TRAINING":
                                    showPanel(jPaneltrain);
                                    break;
                            case "VACATION":
                                    showPanel(jPanelvacay);
                                    break;
                            case "SALARY":
                                    showPanel(jPanelsal);
                                    break;
                            case "ATTENDANCE":
                                    showPanel(jPanelatt);
                                    break;
                            case "EVALUATION":
                                    showPanel(jPaneleval);
                                    break;
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        
                        label.setBorder(brown_border);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        label.setBorder(default_border);
                     }
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jpanelmenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_menuitem1 = new javax.swing.JLabel();
        jLabel_menuitem2 = new javax.swing.JLabel();
        jLabel_menuitem3 = new javax.swing.JLabel();
        jLabel_menuitem4 = new javax.swing.JLabel();
        jLabel_menuitem6 = new javax.swing.JLabel();
        jLabel_menuitem5 = new javax.swing.JLabel();
        jLabel_menuitem7 = new javax.swing.JLabel();
        jLabel_menuitem8 = new javax.swing.JLabel();
        jPaneldb = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelemp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptab1 = new javax.swing.JTable();
        jPaneldept = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        depttab = new javax.swing.JTable();
        jPaneltrain = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        traintab = new javax.swing.JTable();
        jPanelvacay = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        vactab = new javax.swing.JTable();
        jPanelsal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        saltab = new javax.swing.JTable();
        jPanelatt = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        atttab = new javax.swing.JTable();
        jPaneleval = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        evaltab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(235, 218, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(178, 120, 74));

        jpanelmenu.setBackground(new java.awt.Color(235, 218, 204));

        jPanel2.setBackground(new java.awt.Color(235, 218, 204));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/company2_trsp.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/logo2_trsp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel_menuitem1.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem1.setText("      DASHBOARD");

        jLabel_menuitem2.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem2.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/emp.png"))); // NOI18N
        jLabel_menuitem2.setText("   EMPLOYEE");
        jLabel_menuitem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem2MouseClicked(evt);
            }
        });

        jLabel_menuitem3.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/dept.png"))); // NOI18N
        jLabel_menuitem3.setText("    DEPARTMENT");
        jLabel_menuitem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem3MouseClicked(evt);
            }
        });

        jLabel_menuitem4.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem4.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/train.png"))); // NOI18N
        jLabel_menuitem4.setText("   TRAINING");
        jLabel_menuitem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem4MouseClicked(evt);
            }
        });

        jLabel_menuitem6.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem6.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/cash.png"))); // NOI18N
        jLabel_menuitem6.setText("    SALARY");
        jLabel_menuitem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem6MouseClicked(evt);
            }
        });

        jLabel_menuitem5.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/vacay.png"))); // NOI18N
        jLabel_menuitem5.setText("    VACATION");
        jLabel_menuitem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem5MouseClicked(evt);
            }
        });

        jLabel_menuitem7.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem7.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/attend.png"))); // NOI18N
        jLabel_menuitem7.setText("    ATTENDANCE");
        jLabel_menuitem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem7MouseClicked(evt);
            }
        });

        jLabel_menuitem8.setBackground(new java.awt.Color(235, 218, 204));
        jLabel_menuitem8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_menuitem8.setForeground(new java.awt.Color(153, 102, 0));
        jLabel_menuitem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/eval.png"))); // NOI18N
        jLabel_menuitem8.setText("    EVALUATION");
        jLabel_menuitem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelmenuLayout = new javax.swing.GroupLayout(jpanelmenu);
        jpanelmenu.setLayout(jpanelmenuLayout);
        jpanelmenuLayout.setHorizontalGroup(
            jpanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelmenuLayout.createSequentialGroup()
                .addGroup(jpanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelmenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_menuitem8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_menuitem7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_menuitem6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_menuitem5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_menuitem4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_menuitem2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        jpanelmenuLayout.setVerticalGroup(
            jpanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelmenuLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel_menuitem2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_menuitem4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuitem5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_menuitem6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_menuitem7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_menuitem8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPaneldb.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/tagline.png"))); // NOI18N

        javax.swing.GroupLayout jPaneldbLayout = new javax.swing.GroupLayout(jPaneldb);
        jPaneldb.setLayout(jPaneldbLayout);
        jPaneldbLayout.setHorizontalGroup(
            jPaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldbLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPaneldbLayout.setVerticalGroup(
            jPaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(235, 218, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        jPanelemp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("EMPLOYEES");

        emptab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USER NAME", "LAST NAME", "FIRST NAME", "MIDDLE NAME", "GENDER", "EMAIL ADDRESS", "USER TYPE ID", "PASSWORD"
            }
        ));
        jScrollPane1.setViewportView(emptab1);
        if (emptab1.getColumnModel().getColumnCount() > 0) {
            emptab1.getColumnModel().getColumn(0).setResizable(false);
            emptab1.getColumnModel().getColumn(1).setResizable(false);
            emptab1.getColumnModel().getColumn(2).setResizable(false);
            emptab1.getColumnModel().getColumn(3).setResizable(false);
            emptab1.getColumnModel().getColumn(4).setResizable(false);
            emptab1.getColumnModel().getColumn(5).setResizable(false);
            emptab1.getColumnModel().getColumn(6).setResizable(false);
            emptab1.getColumnModel().getColumn(7).setResizable(false);
            emptab1.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanelempLayout = new javax.swing.GroupLayout(jPanelemp);
        jPanelemp.setLayout(jPanelempLayout);
        jPanelempLayout.setHorizontalGroup(
            jPanelempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelempLayout.createSequentialGroup()
                .addGroup(jPanelempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelempLayout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1))
                    .addGroup(jPanelempLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanelempLayout.setVerticalGroup(
            jPanelempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelempLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        jPaneldept.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 0));
        jLabel2.setText("DEPARTMENT");

        depttab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DEPARTMENT ID", "DEPARTMENT TITLE"
            }
        ));
        jScrollPane2.setViewportView(depttab);
        if (depttab.getColumnModel().getColumnCount() > 0) {
            depttab.getColumnModel().getColumn(0).setResizable(false);
            depttab.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPaneldeptLayout = new javax.swing.GroupLayout(jPaneldept);
        jPaneldept.setLayout(jPaneldeptLayout);
        jPaneldeptLayout.setHorizontalGroup(
            jPaneldeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldeptLayout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPaneldeptLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );
        jPaneldeptLayout.setVerticalGroup(
            jPaneldeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldeptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        jPaneltrain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("TRAINING");

        traintab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRAINING_ID", "TRAINING_TITLE", "TRAINING DESCRIPTION"
            }
        ));
        jScrollPane3.setViewportView(traintab);
        if (traintab.getColumnModel().getColumnCount() > 0) {
            traintab.getColumnModel().getColumn(0).setResizable(false);
            traintab.getColumnModel().getColumn(1).setResizable(false);
            traintab.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPaneltrainLayout = new javax.swing.GroupLayout(jPaneltrain);
        jPaneltrain.setLayout(jPaneltrainLayout);
        jPaneltrainLayout.setHorizontalGroup(
            jPaneltrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltrainLayout.createSequentialGroup()
                .addGroup(jPaneltrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneltrainLayout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel3))
                    .addGroup(jPaneltrainLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPaneltrainLayout.setVerticalGroup(
            jPaneltrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltrainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        jPanelvacay.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 0));
        jLabel4.setText("VACATION");

        vactab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VACATION ID", "VACATION TITLE", "VACATION FROM DATE", "VACATION TO DATE", "EMPLOYEE ID"
            }
        ));
        jScrollPane4.setViewportView(vactab);
        if (vactab.getColumnModel().getColumnCount() > 0) {
            vactab.getColumnModel().getColumn(0).setResizable(false);
            vactab.getColumnModel().getColumn(1).setResizable(false);
            vactab.getColumnModel().getColumn(2).setResizable(false);
            vactab.getColumnModel().getColumn(3).setResizable(false);
            vactab.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanelvacayLayout = new javax.swing.GroupLayout(jPanelvacay);
        jPanelvacay.setLayout(jPanelvacayLayout);
        jPanelvacayLayout.setHorizontalGroup(
            jPanelvacayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelvacayLayout.createSequentialGroup()
                .addGroup(jPanelvacayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelvacayLayout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel4))
                    .addGroup(jPanelvacayLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanelvacayLayout.setVerticalGroup(
            jPanelvacayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelvacayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jPanelsal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setText("SALARY");

        saltab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SALARY", "BONUS", "LOAN", "LAST UPDATE", "EMPLOYEE ID"
            }
        ));
        jScrollPane5.setViewportView(saltab);
        if (saltab.getColumnModel().getColumnCount() > 0) {
            saltab.getColumnModel().getColumn(0).setResizable(false);
            saltab.getColumnModel().getColumn(1).setResizable(false);
            saltab.getColumnModel().getColumn(2).setResizable(false);
            saltab.getColumnModel().getColumn(3).setResizable(false);
            saltab.getColumnModel().getColumn(4).setResizable(false);
            saltab.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanelsalLayout = new javax.swing.GroupLayout(jPanelsal);
        jPanelsal.setLayout(jPanelsalLayout);
        jPanelsalLayout.setHorizontalGroup(
            jPanelsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsalLayout.createSequentialGroup()
                .addGroup(jPanelsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelsalLayout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel5))
                    .addGroup(jPanelsalLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanelsalLayout.setVerticalGroup(
            jPanelsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jPanelatt.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 0));
        jLabel6.setText("ATTENDANCE");

        atttab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ATTENDANCE TYPE", "ATTENDANCE TIME & DATE", "EMPLOYEE ID"
            }
        ));
        jScrollPane6.setViewportView(atttab);
        if (atttab.getColumnModel().getColumnCount() > 0) {
            atttab.getColumnModel().getColumn(0).setResizable(false);
            atttab.getColumnModel().getColumn(1).setResizable(false);
            atttab.getColumnModel().getColumn(2).setResizable(false);
            atttab.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanelattLayout = new javax.swing.GroupLayout(jPanelatt);
        jPanelatt.setLayout(jPanelattLayout);
        jPanelattLayout.setHorizontalGroup(
            jPanelattLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelattLayout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelattLayout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        jPanelattLayout.setVerticalGroup(
            jPanelattLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelattLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jPaneleval.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 0));
        jLabel7.setText("EVALUATION");

        evaltab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EVALUATION ID", "USER ID", "EVALUATION VALUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(evaltab);
        if (evaltab.getColumnModel().getColumnCount() > 0) {
            evaltab.getColumnModel().getColumn(0).setResizable(false);
            evaltab.getColumnModel().getColumn(1).setResizable(false);
            evaltab.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanelevalLayout = new javax.swing.GroupLayout(jPaneleval);
        jPaneleval.setLayout(jPanelevalLayout);
        jPanelevalLayout.setHorizontalGroup(
            jPanelevalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelevalLayout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelevalLayout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        jPanelevalLayout.setVerticalGroup(
            jPanelevalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelevalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jpanelmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPaneldb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addComponent(jPanelemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addComponent(jPaneldept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(250, Short.MAX_VALUE)
                    .addComponent(jPaneltrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(250, Short.MAX_VALUE)
                    .addComponent(jPanelvacay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(250, Short.MAX_VALUE)
                    .addComponent(jPanelsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(249, Short.MAX_VALUE)
                    .addComponent(jPanelatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(250, Short.MAX_VALUE)
                    .addComponent(jPaneleval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneldb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(64, Short.MAX_VALUE)
                    .addComponent(jPanelemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jPaneldept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jPaneltrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 65, Short.MAX_VALUE)
                    .addComponent(jPanelvacay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 66, Short.MAX_VALUE)
                    .addComponent(jPanelsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 66, Short.MAX_VALUE)
                    .addComponent(jPanelatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jPaneleval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_menuitem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem2MouseClicked
        // TODO add your handling code here:
        //Database Connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr_bsit1b_it04_jqjz","root","123456");
            Statement st = con.createStatement();
            String sql = "Select * from tbljqjz_user";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("ID"));
                String User_name = rs.getString("User_name");
                String Last_name = rs.getString("Last_name");
                String First_name = rs.getString("First_name");
                String Middle_name = rs.getString("Middle_name");
                String Gender = rs.getString("Gender");
                String Email_address  = rs.getString("Email_address");
                String User_type_id = String.valueOf(rs.getInt("User_type_id"));
                String Password  = rs.getString("Password");
                
                String tbData[] = {id,User_name,Last_name,First_name,Middle_name,Gender,Email_address,User_type_id,Password};
                DefaultTableModel tblmodel = (DefaultTableModel)emptab1.getModel();
                tblmodel.addRow(tbData);
                        

            }
            
        con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel_menuitem2MouseClicked

    private void jLabel_menuitem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem3MouseClicked
        // TODO add your handling code here:
        //Database Connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr_bsit1b_it04_jqjz","root","123456");
            Statement st = con.createStatement();
            String sql = "Select * from tbljqjz_departments";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String Department_id = String.valueOf(rs.getInt("Department_ID"));
                String Department_title = rs.getString("Department_title");
                
                
                String tbData[] = {Department_id,Department_title};
                DefaultTableModel tblmodel = (DefaultTableModel)depttab.getModel();
                tblmodel.addRow(tbData);
                        

            }
            
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel_menuitem3MouseClicked

    private void jLabel_menuitem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem4MouseClicked
        // TODO add your handling code here:
         //Database Connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr_bsit1b_it04_jqjz","root","123456");
            Statement st = con.createStatement();
            String sql = "Select * from tbljqjz_trainings";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String Training_id = String.valueOf(rs.getInt("Training_ID"));
                String Training_title = rs.getString("Training_title");
                String Training_description = rs.getString("Training_description");
                
                
                String tbData[] = {Training_id,Training_title,Training_description};
                DefaultTableModel tblmodel = (DefaultTableModel)traintab.getModel();
                tblmodel.addRow(tbData);
                        

            }
            
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel_menuitem4MouseClicked

    private void jLabel_menuitem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem5MouseClicked
        // TODO add your handling code here:
         //Database Connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr_bsit1b_it04_jqjz","root","123456");
            Statement st = con.createStatement();
            String sql = "Select * from tbljqjz_vacations";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String Vacation_id = String.valueOf(rs.getInt("Vacation_ID"));
                String Vacation_title = rs.getString("Vacation_title");
                String Vacation_from_date = rs.getString("Vacation_from_date");
                String Vacation_to_date = rs.getString("Vacation_to_date");
                String Employee_id = String.valueOf(rs.getInt("Employee_ID"));
                
                
                String tbData[] = {Vacation_id,Vacation_title,Vacation_from_date,Vacation_to_date,Employee_id};
                DefaultTableModel tblmodel = (DefaultTableModel)vactab.getModel();
                tblmodel.addRow(tbData);
                        

            }
            
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel_menuitem5MouseClicked

    private void jLabel_menuitem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem6MouseClicked
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr_bsit1b_it04_jqjz","root","123456");
            Statement st = con.createStatement();
            String sql = "Select * from tbljqjz_salary";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String salary = rs.getString("salary");
                String bonus = rs.getString("bonus");
                String loan = rs.getString("loan");
                String Employee_id = String.valueOf(rs.getInt("Employee_ID"));
                
                
                String tbData[] = {id,salary,bonus,loan,Employee_id};
                DefaultTableModel tblmodel = (DefaultTableModel)saltab.getModel();
                tblmodel.addRow(tbData);
                        

            }
            
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel_menuitem6MouseClicked

    private void jLabel_menuitem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem7MouseClicked
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr_bsit1b_it04_jqjz","root","123456");
            Statement st = con.createStatement();
            String sql = "Select * from tbljqjz_attendance";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String Att_type = rs.getString("Att_type");
                String Att_time_date = rs.getString("Att_time_date");
                String Employee_id = String.valueOf(rs.getInt("Employee_ID"));
                
                
                String tbData[] = {id,Att_type,Att_time_date,Employee_id};
                DefaultTableModel tblmodel = (DefaultTableModel)atttab.getModel();
                tblmodel.addRow(tbData);
                        

            }
            
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel_menuitem7MouseClicked

    private void jLabel_menuitem8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem8MouseClicked
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hr_bsit1b_it04_jqjz","root","123456");
            Statement st = con.createStatement();
            String sql = "Select * from tbljqjz_evaluation";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String Eval_id = String.valueOf(rs.getInt("Eval_id"));
                String User_id = String.valueOf(rs.getInt("User_id"));
                String Eval_value = rs.getString("Eval_value");
               
                
                
                String tbData[] = {Eval_id,User_id,Eval_value};
                DefaultTableModel tblmodel = (DefaultTableModel)evaltab.getModel();
                tblmodel.addRow(tbData);
                        

            }
            
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel_menuitem8MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmdb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmdb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmdb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmdb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmdb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable atttab;
    private javax.swing.JTable depttab;
    private javax.swing.JTable emptab1;
    private javax.swing.JTable evaltab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_menuitem1;
    private javax.swing.JLabel jLabel_menuitem2;
    private javax.swing.JLabel jLabel_menuitem3;
    private javax.swing.JLabel jLabel_menuitem4;
    private javax.swing.JLabel jLabel_menuitem5;
    private javax.swing.JLabel jLabel_menuitem6;
    private javax.swing.JLabel jLabel_menuitem7;
    private javax.swing.JLabel jLabel_menuitem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelatt;
    private javax.swing.JPanel jPaneldb;
    private javax.swing.JPanel jPaneldept;
    private javax.swing.JPanel jPanelemp;
    private javax.swing.JPanel jPaneleval;
    private javax.swing.JPanel jPanelsal;
    private javax.swing.JPanel jPaneltrain;
    private javax.swing.JPanel jPanelvacay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel jpanelmenu;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable saltab;
    private javax.swing.JTable traintab;
    private javax.swing.JTable vactab;
    // End of variables declaration//GEN-END:variables
}
