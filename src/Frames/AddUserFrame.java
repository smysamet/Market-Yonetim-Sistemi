package Frames;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddUserFrame extends javax.swing.JFrame {

    public AddUserFrame() {
        initComponents();
        nameErrorLabel.setText("");
        passwordErrorLabel.setText("");
        mailErrorLabel.setText("");
        surnameErrorLabel.setText("");
        typeErrorLabel.setText("");
        nameLabel.setForeground(Color.white);
        passwordLabel.setForeground(Color.white);
        mailLabel.setForeground(Color.white);
        surnameLabel.setForeground(Color.white);
        typeLabel.setForeground(Color.white);
        this.getContentPane().setBackground(new Color(56, 56, 56));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        mailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        nameErrorLabel = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();
        typeTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        surnameTextFile = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        passwordErrorLabel = new javax.swing.JLabel();
        mailErrorLabel = new javax.swing.JLabel();
        surnameErrorLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        typeErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add User");

        addButton.setBackground(new java.awt.Color(142, 184, 250));
        addButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        mailLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mailLabel.setText("Mail :");

        nameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameLabel.setText("Name :");

        surnameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        surnameLabel.setText("Surname :");

        passwordLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordLabel.setText("Password : ");

        nameErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        nameErrorLabel.setText("Only Digits!");

        mailTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailTextFieldFocusLost(evt);
            }
        });

        typeTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        typeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                typeTextFieldFocusLost(evt);
            }
        });

        nameTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        surnameTextFile.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        surnameTextFile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameTextFileFocusLost(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(142, 184, 250));
        backButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        passwordErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        passwordErrorLabel.setText("Only Digits!");

        mailErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        mailErrorLabel.setText("Can't be empty!");

        surnameErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        surnameErrorLabel.setText("Can't be empty!");

        typeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        typeLabel.setText("Type :");

        passwordTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusLost(evt);
            }
        });

        typeErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        typeErrorLabel.setText("Only Digits!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(typeLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(surnameTextFile, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameErrorLabel)
                    .addComponent(passwordErrorLabel)
                    .addComponent(mailErrorLabel)
                    .addComponent(surnameErrorLabel)
                    .addComponent(typeErrorLabel))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailErrorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameErrorLabel)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(surnameTextFile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(surnameErrorLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordErrorLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            if (!isNull()) {
                addUser();
                MainMenuFrame mainMen = new MainMenuFrame();
                mainMen.setLocationRelativeTo(null);
                mainMen.setVisible(true);
                this.dispose();
            } else {
                if (mailTextField.getText().isEmpty()) {
                    mailErrorLabel.setText("Can't be empty!");
                }
                if (nameTextField.getText().isEmpty()) {
                    nameErrorLabel.setText("Can't be empty!");
                }
                if (surnameTextFile.getText().isEmpty()) {
                    surnameErrorLabel.setText("Can't be empty!");
                }
                if (typeTextField.getText().isEmpty()) {
                    typeErrorLabel.setText("Can't be empty!");
                }
                if(passwordTextField.getText().isEmpty()){
                    passwordErrorLabel.setText("Can't be empty!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainMenuFrame mainMen = new MainMenuFrame();
        mainMen.setLocationRelativeTo(null);
        mainMen.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_backButtonActionPerformed

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost

        if (!nameTextField.getText().isEmpty())
            nameErrorLabel.setText("");
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void typeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeTextFieldFocusLost
        
        if(!typeTextField.getText().isEmpty())
            typeErrorLabel.setText("");
    }//GEN-LAST:event_typeTextFieldFocusLost

    private void mailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextFieldFocusLost
        if (!mailTextField.getText().isEmpty())
            mailErrorLabel.setText("");
    }//GEN-LAST:event_mailTextFieldFocusLost

    private void surnameTextFileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTextFileFocusLost
        if(!surnameTextFile.getText().isEmpty())
            surnameErrorLabel.setText("");
    }//GEN-LAST:event_surnameTextFileFocusLost

    private void passwordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusLost
        if(!passwordTextField.getText().isEmpty()){
            passwordErrorLabel.setText("");
        }
    }//GEN-LAST:event_passwordTextFieldFocusLost

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
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductFrame().setVisible(true);
            }
        });
    }

    public void addUser() throws SQLException {
        Connection conn = DriverManager.getConnection(PersonelLoginFrame.connector.getConnectionLink(),
            PersonelLoginFrame.connector.getUserName(), PersonelLoginFrame.connector.getPassword());
        Statement stmt = conn.createStatement();
        String mail = mailTextField.getText();
        String password = passwordTextField.getText();
        String name = nameTextField.getText();
        String surname = surnameTextFile.getText();
        String type = typeTextField.getText();
        //"insert into product(product_title,product_price,product_description,product_count) values("kamyon",200,"yavas",5)"    
        stmt.executeUpdate("insert into products.user_info(name,surname,mail,password,type)values('"+name+"','"+surname+"','"+mail+"',sha1('"+password+"'),'"+type+"')");

        stmt.close();
        conn.close();
             
        
    }
    // boş geçilmemesi için check 
    boolean isNull() {
        if (mailTextField.getText().isEmpty()
                || typeTextField.getText().isEmpty()
                || nameTextField.getText().isEmpty()
                || surnameTextFile.getText().isEmpty()
                || passwordTextField.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel mailErrorLabel;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel surnameErrorLabel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameTextFile;
    private javax.swing.JLabel typeErrorLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField typeTextField;
    // End of variables declaration//GEN-END:variables
}
