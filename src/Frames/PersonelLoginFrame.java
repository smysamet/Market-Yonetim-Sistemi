package Frames;

import Database.DatabaseConnector;
import Database.MysqlConnector;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonelLoginFrame extends javax.swing.JFrame {
    
    public static DatabaseConnector connector;
    
    public static boolean isAdmin = false;
    
    Properties prop = new Properties();
    public PersonelLoginFrame() {
        try {
            
            // şuanki konumda bir dosya oluşturuyoruz ve onun konumunu alıyoruz
            String filepath = new File("").getAbsolutePath();
            
            // onun konumu üzerine erişmek istediğimiz dosyayı ekliyoruz 
            filepath += "/src/Main/DatabaseProperties.properties";
            
            prop.load(new FileInputStream(filepath));
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        initComponents();
        mailErrorLabel.setText("");
        passwordErrorLabel.setText("");
        this.getContentPane().setBackground(new Color(56, 56, 56));
        jLabel1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        mailErrorLabel = new javax.swing.JLabel();
        passwordErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Mail : ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Password :");

        mailTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        loginButton.setBackground(new java.awt.Color(142, 227, 73));
        loginButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        mailErrorLabel.setForeground(new java.awt.Color(255, 64, 64));
        mailErrorLabel.setText("Can't be empty!");

        passwordErrorLabel.setForeground(new java.awt.Color(255, 64, 64));
        passwordErrorLabel.setText("Can't be empty!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailErrorLabel)
                    .addComponent(passwordErrorLabel))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordErrorLabel))
                .addGap(30, 30, 30)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        if (mailTextField.getText().isEmpty()){
            mailErrorLabel.setText("Can't be empty!");
        }else{
            mailErrorLabel.setText("");
        }
        
        
        if (passwordTextField.getText().isEmpty()){
            passwordErrorLabel.setText("Can't be empty!");
            return;
        }else{
            passwordErrorLabel.setText("");
        }
        
        try {
            if (loginCheck(mailTextField.getText(), passwordTextField.getText())) {

                if (PersonelLoginFrame.isAdmin) {
                    MainMenuFrame mainMen = new MainMenuFrame();
                    mainMen.setLocationRelativeTo(null);
                    mainMen.setVisible(true);
                } else {
                    PersonelMainMenuFrame frame = new PersonelMainMenuFrame();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
                this.dispose();
 
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelLoginFrame().setVisible(true);
            }
        });
    }
    
    private boolean loginCheck(String mail, String password) throws SQLException{
        connector = new MysqlConnector("testdb", "root", "admin");
        connector.connectToDatabase();
        connector.setDataBaseName("testdb");
        connector.setProductTableLink("testdb.product");
        connector.setStoreTableLink("products.stores");
        Connection conn = DriverManager.getConnection(connector.getConnectionLink(),
                connector.getUserName(), connector.getPassword());
        Statement stmt = conn.createStatement();
        ResultSet reSSet = stmt.executeQuery("SELECT * FROM products.user_info WHERE mail = '"+mail+"'");
        
        
        String passwordFromDB = "";
        if(reSSet.next()){
            passwordFromDB = reSSet.getString("password");
            if(reSSet.getString("type").equals("admin")){
                isAdmin = true;
            }
        } 
        
        reSSet = stmt.executeQuery("select sha1('"+password+"')");
        String pswCheck ="";
        if(reSSet.next()){
            pswCheck = reSSet.getString("sha1('"+password+"')");
        }
        
        return passwordFromDB.equals(pswCheck);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel mailErrorLabel;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JTextField passwordTextField;
    // End of variables declaration//GEN-END:variables
}
