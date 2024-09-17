/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author CSN
 */
public class Forgot_Password extends javax.swing.JFrame {
    
    Connection con = null;
    Resultset result = null;
    PreparedStatement statement = null;
    public String user;

    /**
     * Creates new form Forgot_Password
     */
    public Forgot_Password() {
        initComponents();
    }
    
    public Forgot_Password(String Email)
    {
        this.user = Email;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        resetPass = new javax.swing.JPasswordField();
        showPass = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        newresetPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setBackground(new java.awt.Color(0, 153, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 390, 10));
        panel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 390, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hotel Grand Seven");
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 580, 50));

        panel1.setBackground(new java.awt.Color(153, 153, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel3.setBackground(new java.awt.Color(0, 153, 153));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 390, 10));
        panel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 390, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hotel Grand Seven");
        panel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 580, 50));

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 120));

        panel4.setBackground(new java.awt.Color(0, 153, 153));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 870, -1));
        panel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 870, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyrights Reserved for Grand Seven - 2024");
        panel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        panel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 870, 120));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Reset Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Confirm Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 170, 40));

        resetPass.setBackground(new java.awt.Color(153, 153, 153));
        resetPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jPanel1.add(resetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 260, 40));

        showPass.setBackground(new java.awt.Color(153, 153, 153));
        showPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Reset");
        jButton3.setToolTipText("");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 180, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("New Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, 40));

        newresetPass.setBackground(new java.awt.Color(153, 153, 153));
        newresetPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newresetPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        newresetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newresetPassActionPerformed(evt);
            }
        });
        jPanel1.add(newresetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 260, 40));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 830, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 407, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        // TODO add your handling code here:
        if(showPass.isSelected())
        {
            resetPass.setEchoChar((char)0);
        }
        else
        {
            resetPass.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(resetPass.getText()==newresetPass.getText())
        {
            try {
                String updateQuery = "UPDATE `forgot_pass` SET `Password`=? WHERE Email="+user;
                con = DriverManager.getConnection("jdbc:mysql://localhost/forgot_pass","root","");
                statement.setString(1,newresetPass.getText());
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reset successfully");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Password do not match");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void newresetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newresetPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newresetPassActionPerformed

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
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField newresetPass;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private javax.swing.JPasswordField resetPass;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
}
