package Frames;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddProductFrame extends javax.swing.JFrame {

    
    
    private boolean addable = false;
    private boolean addable2 = false;

    public AddProductFrame() {
        initComponents();
        priceErrorLabel.setText("");
        countErrorLabel.setText("");
        titleErrorLabel.setText("");
        descErrorLabel.setText("");
        storeIdErrorLabel.setText("");
        priceLabel.setForeground(Color.white);
        countLabel.setForeground(Color.white);
        titleLabel.setForeground(Color.white);
        descLabel.setForeground(Color.white);
        storeIDLabel.setForeground(Color.white);
        this.getContentPane().setBackground(new Color(56, 56, 56));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        countLabel = new javax.swing.JLabel();
        priceErrorLabel = new javax.swing.JLabel();
        titleTextfield = new javax.swing.JTextField();
        storeIdTextFild = new javax.swing.JTextField();
        priceTextfield = new javax.swing.JTextField();
        descTextfield = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        countErrorLabel = new javax.swing.JLabel();
        titleErrorLabel = new javax.swing.JLabel();
        descErrorLabel = new javax.swing.JLabel();
        storeIDLabel = new javax.swing.JLabel();
        countTextfield1 = new javax.swing.JTextField();
        storeIdErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Product");

        addButton.setBackground(new java.awt.Color(142, 184, 250));
        addButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleLabel.setText("Product Title : ");

        priceLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        priceLabel.setText("Product Price : ");

        descLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        descLabel.setText("Product Description : ");

        countLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        countLabel.setText("Product Count : ");

        priceErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        priceErrorLabel.setText("Only Digits!");

        titleTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                titleTextfieldFocusLost(evt);
            }
        });

        storeIdTextFild.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        storeIdTextFild.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                storeIdTextFildFocusLost(evt);
            }
        });

        priceTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        priceTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceTextfieldFocusLost(evt);
            }
        });

        descTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        descTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                descTextfieldFocusLost(evt);
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

        countErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        countErrorLabel.setText("Only Digits!");

        titleErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        titleErrorLabel.setText("Can't be empty!");

        descErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        descErrorLabel.setText("Can't be empty!");

        storeIDLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        storeIDLabel.setText("Store Id : ");

        countTextfield1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        countTextfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countTextfield1FocusLost(evt);
            }
        });

        storeIdErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        storeIdErrorLabel.setText("Only Digits!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descLabel)
                            .addComponent(countLabel)
                            .addComponent(storeIDLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(storeIdTextFild, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(countTextfield1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceErrorLabel)
                    .addComponent(countErrorLabel)
                    .addComponent(titleErrorLabel)
                    .addComponent(descErrorLabel)
                    .addComponent(storeIdErrorLabel))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleErrorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priceErrorLabel)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(descTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descErrorLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countErrorLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeIdTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeIdErrorLabel))
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
            if (addable && addable2 && !isNull()) {
                addProduct();
                MainMenuFrame mainMen = new MainMenuFrame();
                mainMen.setLocationRelativeTo(null);
                mainMen.setVisible(true);
                this.dispose();
            } else {
                if (titleTextfield.getText().isEmpty()) {
                    titleErrorLabel.setText("Can't be empty!");
                }
                if (priceTextfield.getText().isEmpty()) {
                    priceErrorLabel.setText("Can't be empty!");
                }
                if (descTextfield.getText().isEmpty()) {
                    descErrorLabel.setText("Can't be empty!");
                }
                if (storeIdTextFild.getText().isEmpty()) {
                    countErrorLabel.setText("Can't be empty!");
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

    private void priceTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTextfieldFocusLost
        
        if (!priceTextfield.getText().isEmpty())
            priceErrorLabel.setText("");
        
        String value = priceTextfield.getText();
        for(int i=0; i<value.length();i++){
            if(!Character.isDigit(value.charAt(i))){
                priceErrorLabel.setText("Only digits !");
                addable = false;
                break;
            }
            if(i==value.length()-1){
                addable = true;
                priceErrorLabel.setText("");
            }
        }
    }//GEN-LAST:event_priceTextfieldFocusLost

    private void storeIdTextFildFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_storeIdTextFildFocusLost
        
        if(!storeIdTextFild.getText().isEmpty())
            countErrorLabel.setText("");
        
        String value = storeIdTextFild.getText();
        for(int i=0; i<value.length();i++){
            if(!Character.isDigit(value.charAt(i))){
                countErrorLabel.setText("Only digits !");
                addable2 = false;
                break;
            }
            if(i==value.length()-1){
                addable2 = true;
                countErrorLabel.setText("");
            }
        }
    }//GEN-LAST:event_storeIdTextFildFocusLost

    private void titleTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_titleTextfieldFocusLost
        if (!titleTextfield.getText().isEmpty())
            titleErrorLabel.setText("");
    }//GEN-LAST:event_titleTextfieldFocusLost

    private void descTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descTextfieldFocusLost
        if(!descTextfield.getText().isEmpty())
            descErrorLabel.setText("");
    }//GEN-LAST:event_descTextfieldFocusLost

    private void countTextfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countTextfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextfield1FocusLost

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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

    public void addProduct() throws SQLException {

            
        //MysqlDataSource datasource = MysqlConnector.dataSource;
        //onnection conn = LoginFrame.connector.getDataSource().getConnection();
        Connection conn = DriverManager.getConnection(PersonelLoginFrame.connector.getConnectionLink(),
            PersonelLoginFrame.connector.getUserName(), PersonelLoginFrame.connector.getPassword());
        Statement stmt = conn.createStatement();
        String prd_title = titleTextfield.getText();
        String prd_count = countTextfield1.getText();
        String prd_price = priceTextfield.getText();
        String prd_desc = descTextfield.getText();
        String stor_id = storeIdTextFild.getText();
        //"insert into product(product_title,product_price,product_description,product_count) values("kamyon",200,"yavas",5)"    
        stmt.executeUpdate("insert into "+PersonelLoginFrame.connector.getProductTableLink()+"(product_title,product_price,product_description,product_count,store_id) values("+"'"+prd_title+"','"+prd_price+"','"+prd_desc+"','"+prd_count+"','"+stor_id+"')");
                

        stmt.close();
        conn.close();
             
        
    }
    // boş geçilmemesi için check 
    boolean isNull() {
        if (titleTextfield.getText().isEmpty()
                || storeIdTextFild.getText().isEmpty()
                || priceTextfield.getText().isEmpty()
                || descTextfield.getText().isEmpty()
                || countTextfield1.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // digit var mı kontrolü
    boolean onlyDigit(String s) {
        try {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel countErrorLabel;
    private javax.swing.JLabel countLabel;
    private javax.swing.JTextField countTextfield1;
    private javax.swing.JLabel descErrorLabel;
    private javax.swing.JLabel descLabel;
    private javax.swing.JTextField descTextfield;
    private javax.swing.JLabel priceErrorLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextfield;
    private javax.swing.JLabel storeIDLabel;
    private javax.swing.JLabel storeIdErrorLabel;
    private javax.swing.JTextField storeIdTextFild;
    private javax.swing.JLabel titleErrorLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTextfield;
    // End of variables declaration//GEN-END:variables
}
