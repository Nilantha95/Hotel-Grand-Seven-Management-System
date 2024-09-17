/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EmployeeMgt;

import Login.SignUp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
/**
 *
 * @author CSN
 */
public class Update_Emp extends javax.swing.JFrame {

    /**
     * Creates new form Update_Emp
     */
    public Update_Emp() {
        initComponents();
        loadEmpData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        EmpUpSearch = new javax.swing.JTextField();
        btnSearchUpdateEmp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updateFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        updateLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        updateContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updateEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updateID = new javax.swing.JTextField();
        btnUpdateEmp = new javax.swing.JButton();
        updateAddress1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Update Employee Details");

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        updateTable.setBackground(new java.awt.Color(153, 153, 153));
        updateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "empID", "First Name", "Last Name", "Contact", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(updateTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enter search ID");

        EmpUpSearch.setBackground(new java.awt.Color(204, 204, 204));

        btnSearchUpdateEmp.setBackground(new java.awt.Color(0, 102, 0));
        btnSearchUpdateEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchUpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchUpdateEmp.setText("Search");
        btnSearchUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUpdateEmpActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("First Name");

        updateFname.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        updateLname.setBackground(new java.awt.Color(204, 204, 204));
        updateLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Contact");

        updateContact.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        updateEmail.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address");

        updateID.setBackground(new java.awt.Color(204, 204, 204));
        updateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateIDActionPerformed(evt);
            }
        });

        btnUpdateEmp.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdateEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateEmp.setText("Update");
        btnUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmpActionPerformed(evt);
            }
        });

        updateAddress1.setBackground(new java.awt.Color(204, 204, 204));
        updateAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAddress1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("EmpID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateFname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateLname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(EmpUpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchUpdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateID, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(updateContact)
                                .addComponent(updateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpUpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnSearchUpdateEmp)
                    .addComponent(btnUpdateEmp))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(updateFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(updateContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(updateLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(updateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        Emp_Dashboard newDash = new Emp_Dashboard();
        newDash.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        SignUp newSignup = new SignUp();
        newSignup.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSearchUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUpdateEmpActionPerformed
        // TODO add your handling code here:
        String empID;
        int notFound = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String Url = "jdbc:MySQL://localhost:3306/hotelmgt";
            String User = "root";
            String Pass = "";

            Connection con = DriverManager.getConnection(Url, User, Pass);
            Statement statement = con.createStatement();

            empID = EmpUpSearch.getText();

            if("".equals(empID))
            {
                JOptionPane.showMessageDialog(new JFrame(), "Enter the employee ID", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String query = "SELECT * FROM employee_add WHERE empID = "+empID;
                ResultSet result = statement.executeQuery(query);

                while(result.next())
                {
                    updateFname.setText(result.getString("First Name"));
                    updateLname.setText(result.getString("Last Name"));
                    updateContact.setText(result.getString("Contact"));
                    updateEmail.setText(result.getString("Email"));
                    updateAddress1.setText(result.getString("Address"));
                    updateID.setText(result.getString("empID"));
                    notFound = 1;
                }
                if(notFound == 0)
                {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid employee ID", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error "+ e.getMessage());
        }

    }//GEN-LAST:event_btnSearchUpdateEmpActionPerformed

    public void loadEmpData()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String Url = "jdbc:MySQL://localhost:3306/hotelmgt";
            String User = "root";
            String Pass = "";
            
            Connection con = DriverManager.getConnection(Url, User, Pass);
            Statement statment = con.createStatement();
            
        //DefaultTableModel TblModel = new DefaultTableModel(new String[]{"empID","First Name","Last Name","Contact","Email","Address"}, 0);
        
        //viewTble.setModel(TblModel);
        DefaultTableModel TblModel = (DefaultTableModel) updateTable.getModel();
        TblModel.setRowCount(0);
        String query = "SELECT * FROM employee_add";
        ResultSet result = statment.executeQuery(query);
        String id,fname,lname,contact,email,address;
        
        while(result.next())
        {
            id = result.getString("empID");
            fname = result.getString("First Name");
            lname = result.getString("Last Name");
            contact = result.getString("Contact");
            email = result.getString("Email");
            address = result.getString("Address");
            
            TblModel.addRow(new Object[]{id,fname,lname,contact,email,address});
        }
       con.close();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    
    private void updateLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateLnameActionPerformed

    private void updateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateIDActionPerformed

    private void btnUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmpActionPerformed
            // TODO add your handling code here:
            String empID = updateID.getText();
            String firstName = updateFname.getText();
            String lastName = updateLname.getText();
            String Contact = updateContact.getText();
            String Email = updateEmail.getText();
            String Address = updateID.getText();
            
            try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String Url = "jdbc:MySQL://localhost:3306/hotelmgt";
        String User = "root";
        String Pass = "";
        
        Connection con = DriverManager.getConnection(Url, User, Pass);
        Statement statement = con.createStatement();
        
        String query = "UPDATE employee_add SET `First Name`=?, `Last Name`=?, Contact=?, Email=?, Address=? WHERE empID=?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setString(3, Contact);
        preparedStatement.setString(4, Email);
        preparedStatement.setString(5, Address);
        preparedStatement.setString(6, empID);
        
        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Employee data updated successfully!");
            loadEmpData();
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Failed to update employee data.", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        con.close();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
            
        
        
    }//GEN-LAST:event_btnUpdateEmpActionPerformed

    private void updateAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateAddress1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmpUpSearch;
    private javax.swing.JButton btnSearchUpdateEmp;
    private javax.swing.JButton btnUpdateEmp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField updateAddress1;
    private javax.swing.JTextField updateContact;
    private javax.swing.JTextField updateEmail;
    private javax.swing.JTextField updateFname;
    private javax.swing.JTextField updateID;
    private javax.swing.JTextField updateLname;
    private javax.swing.JTable updateTable;
    // End of variables declaration//GEN-END:variables
}
