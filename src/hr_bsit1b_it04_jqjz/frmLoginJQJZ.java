/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_bsit1b_it04_jqjz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import hr_bsit1b_it04_jqjz.jqjzConnect;
import java.awt.Color;


/**
 *
 * @author JLZapanta;
 */
public class frmLoginJQJZ extends javax.swing.JFrame {
    private Statement jqjzstatement;
    public String strjqjzUserID, strjqjzUserName, strjqjzPassword;
    public int jqjznumberOfRows;
    jqjzConnect jqjzC = new jqjzConnect();
    Connection jqjzconn;
    PreparedStatement jqjzpreparedStatement;
    String selectSQL;
    ResultSet jqjzrs;
    /**
     * Creates new form frmLoginJQJZ
     */
    public frmLoginJQJZ() throws SQLException{
        initComponents();
        makeStatement();
        setTitle("User Login");
        this.setSize(1366,768); //set display of the current jframe form to 1366x768 resolution
    }
    public Statement makeStatement() throws SQLException{
        jqjzConnect c = new jqjzConnect();
        Connection jqjzconn = c.makeConnection();
        jqjzstatement = jqjzconn.createStatement();
        return jqjzstatement;
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
        jPanel1 = new javax.swing.JPanel();
        txtjqjzUserID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbljqjzUserID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtjqjzUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbljqjzUserName = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lbljqjzPassword = new javax.swing.JLabel();
        txtjqjzPassword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnjqjzSignIn = new javax.swing.JLabel();
        lbljqjzRegister = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(175, 102, 37));
        kGradientPanel1.setkGradientFocus(950);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 223, 171));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtjqjzUserID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtjqjzUserID.setForeground(new java.awt.Color(178, 121, 74));
        txtjqjzUserID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtjqjzUserID.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(159, 105, 61));
        jLabel2.setText("My Account");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/user.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(178, 121, 74));
        jSeparator1.setForeground(new java.awt.Color(178, 121, 74));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(178, 121, 74)));

        lbljqjzUserID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbljqjzUserID.setForeground(new java.awt.Color(178, 121, 74));
        lbljqjzUserID.setText("User ID");

        jSeparator2.setBackground(new java.awt.Color(178, 121, 74));
        jSeparator2.setForeground(new java.awt.Color(178, 121, 74));
        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(178, 121, 74)));

        txtjqjzUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtjqjzUserName.setForeground(new java.awt.Color(178, 121, 74));
        txtjqjzUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtjqjzUserName.setBorder(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/id.png"))); // NOI18N

        lbljqjzUserName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbljqjzUserName.setForeground(new java.awt.Color(178, 121, 74));
        lbljqjzUserName.setText("User Name");

        jSeparator5.setBackground(new java.awt.Color(178, 121, 74));
        jSeparator5.setForeground(new java.awt.Color(178, 121, 74));
        jSeparator5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(178, 121, 74)));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/password.png"))); // NOI18N

        lbljqjzPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbljqjzPassword.setForeground(new java.awt.Color(178, 121, 74));
        lbljqjzPassword.setText("Password");

        txtjqjzPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtjqjzPassword.setForeground(new java.awt.Color(178, 121, 74));
        txtjqjzPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtjqjzPassword.setBorder(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/logo2_trsp.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/company2_trsp.png"))); // NOI18N

        btnjqjzSignIn.setBackground(new java.awt.Color(178, 121, 74));
        btnjqjzSignIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnjqjzSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnjqjzSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnjqjzSignIn.setText("SIGN IN");
        btnjqjzSignIn.setOpaque(true);
        btnjqjzSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnjqjzSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnjqjzSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnjqjzSignInMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnjqjzSignInMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnjqjzSignInMouseReleased(evt);
            }
        });

        lbljqjzRegister.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lbljqjzRegister.setForeground(new java.awt.Color(159, 105, 61));
        lbljqjzRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbljqjzRegister.setText("New to Apex? Register to Create an Account.");
        lbljqjzRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(178, 121, 74)));
        lbljqjzRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbljqjzRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbljqjzRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbljqjzRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbljqjzRegisterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbljqjzRegisterMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbljqjzUserName)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtjqjzUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtjqjzUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbljqjzPassword)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnjqjzSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtjqjzPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(lbljqjzUserID))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbljqjzRegister)
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(lbljqjzUserID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtjqjzUserID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lbljqjzUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtjqjzUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lbljqjzPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtjqjzPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnjqjzSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbljqjzRegister)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr_bsit1b_it04_jqjz/images/tagline.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnjqjzSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjqjzSignInMouseClicked
        // TODO add your handling code here:
        if (txtjqjzUserID.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter User ID!");
            txtjqjzUserID.requestFocus();
        }
        else if (txtjqjzUserName.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter User Password!");
            txtjqjzUserName.requestFocus();
        }
        else if (txtjqjzPassword.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter User Password!");
            txtjqjzPassword.requestFocus();
        }
        else {
            try {
                jqjzConnect c = new jqjzConnect();
                Connection jqjzconn = c.makeConnection();
                strjqjzUserID = txtjqjzUserID.getText();
                strjqjzUserName = txtjqjzUserName.getText();
                strjqjzPassword = txtjqjzPassword.getText();
                
                String selectSQL = "SELECT COUNT(*) as totRec FROM tbljqjz_user WHERE id = ? AND User_name = ? AND Password = ?";
                jqjzpreparedStatement = jqjzconn.prepareStatement(selectSQL);
                jqjzpreparedStatement.setString(1,strjqjzUserID);
                jqjzpreparedStatement.setString(2,strjqjzUserName);
                jqjzpreparedStatement.setString(3,strjqjzPassword);
                
                ResultSet jqjzrs = jqjzpreparedStatement.executeQuery();
                
                while(jqjzrs.next()){
                    //JOptionPane.showMessageDialog(null,numberOfRows);
                    jqjznumberOfRows=(jqjzrs.getInt("totRec"));
                }
                if(jqjznumberOfRows==1){
                    selectSQL="SELECT*FROM tbljqjz_user WHERE id=?";
                    jqjzpreparedStatement = jqjzconn.prepareStatement(selectSQL);
                    jqjzpreparedStatement.setString(1,strjqjzUserID);
                    
                    jqjzrs = jqjzpreparedStatement.executeQuery(); 
                    
                    while(jqjzrs.next()){
                        strjqjzUserID = (jqjzrs.getString("id"));
                        strjqjzUserName = (jqjzrs.getString("User_name"));
                        strjqjzPassword = (jqjzrs.getString("Password"));
                        frmHomeJQJZ frmHomepage = new frmHomeJQJZ();
                        frmHomepage.setVisible(true);
                        this.hide();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid User ID, User Name, and Password!");
                    txtjqjzUserID.setText("");
                    txtjqjzUserName.setText("");
                    txtjqjzPassword.setText("");
                }
            }
            catch(SQLException jqjzE){
                System.out.println("Failed");
                jqjzE.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnjqjzSignInMouseClicked

    private void btnjqjzSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjqjzSignInMouseEntered
        // TODO add your handling code here:
        btnjqjzSignIn.setBackground(new java.awt.Color(221, 150, 90));
    }//GEN-LAST:event_btnjqjzSignInMouseEntered

    private void btnjqjzSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjqjzSignInMouseExited
        // TODO add your handling code here:
        btnjqjzSignIn.setBackground(new java.awt.Color(178,121,74));
    }//GEN-LAST:event_btnjqjzSignInMouseExited

    private void btnjqjzSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjqjzSignInMousePressed
        // TODO add your handling code here:
        btnjqjzSignIn.setBackground(new java.awt.Color(221, 150, 90));
    }//GEN-LAST:event_btnjqjzSignInMousePressed

    private void btnjqjzSignInMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjqjzSignInMouseReleased
        // TODO add your handling code here:
        btnjqjzSignIn.setBackground(new java.awt.Color(178,124,90));
    }//GEN-LAST:event_btnjqjzSignInMouseReleased

    private void lbljqjzRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljqjzRegisterMouseClicked
        // TODO add your handling code here:
        // Open jframe form "frmUserSignUpJQJZ"
        try{
            frmUserSignUpJQJZ jf = new frmUserSignUpJQJZ();
        // Display jframe form "frmLoginJQJZ" here
        jf.show();
        // Close current jframe form (frmSignUpJQJZ) after opening frmLoginjqjz
        dispose();
        }
        catch(SQLException jqjzE){
                System.out.println("Failed");
                jqjzE.printStackTrace();
            }
    }//GEN-LAST:event_lbljqjzRegisterMouseClicked

    private void lbljqjzRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljqjzRegisterMouseEntered
        // TODO add your handling code here:
        lbljqjzRegister.setForeground(new java.awt.Color(221, 150, 90));
        lbljqjzRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(221, 150, 90)));
    }//GEN-LAST:event_lbljqjzRegisterMouseEntered

    private void lbljqjzRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljqjzRegisterMouseExited
        // TODO add your handling code here:
        lbljqjzRegister.setForeground(new java.awt.Color(178,121,74));
        lbljqjzRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(178,121,74)));
    }//GEN-LAST:event_lbljqjzRegisterMouseExited

    private void lbljqjzRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljqjzRegisterMousePressed
        // TODO add your handling code here:
        lbljqjzRegister.setForeground(new java.awt.Color(178,121,74));
        lbljqjzRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(178,121,74)));
    }//GEN-LAST:event_lbljqjzRegisterMousePressed

    private void lbljqjzRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljqjzRegisterMouseReleased
        // TODO add your handling code here:
        lbljqjzRegister.setForeground(new java.awt.Color(170,124,90));
        lbljqjzRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(170,124,90)));
    }//GEN-LAST:event_lbljqjzRegisterMouseReleased

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
            java.util.logging.Logger.getLogger(frmLoginJQJZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginJQJZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginJQJZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginJQJZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmLoginJQJZ().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmLoginJQJZ.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnjqjzSignIn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbljqjzPassword;
    private javax.swing.JLabel lbljqjzRegister;
    private javax.swing.JLabel lbljqjzUserID;
    private javax.swing.JLabel lbljqjzUserName;
    private javax.swing.JPasswordField txtjqjzPassword;
    private javax.swing.JTextField txtjqjzUserID;
    private javax.swing.JTextField txtjqjzUserName;
    // End of variables declaration//GEN-END:variables
}
