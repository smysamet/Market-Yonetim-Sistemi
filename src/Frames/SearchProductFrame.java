package Frames;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class SearchProductFrame extends javax.swing.JFrame {

    boolean searchable = false;
    boolean searchable2 = false;

    private ButtonGroup group;

    /**
     * Creates new form ShowProducts
     */
    public SearchProductFrame() throws SQLException {
        initComponents();
        this.getContentPane().setBackground(new Color(56, 56, 56));
        searchErrorLabel.setText("");
        radButErrorLabel.setText("");
        group = new ButtonGroup();
        group.add(idRadioBTN);
        group.add(titleRadioBTN);
        group.add(descRadioBTN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idRadioBTN = new javax.swing.JRadioButton();
        titleRadioBTN = new javax.swing.JRadioButton();
        descRadioBTN = new javax.swing.JRadioButton();
        searchButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        searchErrorLabel = new javax.swing.JLabel();
        radButErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Product");

        backButton.setBackground(new java.awt.Color(142, 184, 250));
        backButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Title", "Product Price", "Product Description", "Product Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        idRadioBTN.setText("by id");

        titleRadioBTN.setText("by title");

        descRadioBTN.setText("by description");

        searchButton.setBackground(new java.awt.Color(142, 184, 250));
        searchButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        searchErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        searchErrorLabel.setText("Can't be empty!");

        radButErrorLabel.setForeground(new java.awt.Color(255, 43, 43));
        radButErrorLabel.setText("Can't be empty!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(searchErrorLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(idRadioBTN)
                        .addGap(18, 18, 18)
                        .addComponent(titleRadioBTN)
                        .addGap(18, 18, 18)
                        .addComponent(descRadioBTN)
                        .addGap(18, 18, 18)
                        .addComponent(radButErrorLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idRadioBTN)
                                    .addComponent(titleRadioBTN)
                                    .addComponent(descRadioBTN)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(radButErrorLabel)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(searchErrorLabel)))))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        if (jTextField1.getText().isEmpty()) {
            searchErrorLabel.setText("Can't be empty!");
            searchable = false;
        } else {
            searchable = true;
            searchErrorLabel.setText("");
        }

        if (group.getSelection() == null) {
            radButErrorLabel.setText("Can't be empty!");
            searchable2 = false;
        } else {
            searchable2 = true;
            radButErrorLabel.setText("");
        }
        

        if (searchable && searchable2) {
            try {
                searchProducts();
            } catch (SQLException ex) {
                Logger.getLogger(SearchProductFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (PersonelLoginFrame.isAdmin) {
            MainMenuFrame mainMen = new MainMenuFrame();
            mainMen.setLocationRelativeTo(null);
            mainMen.setVisible(true);
        }else{
            PersonelMainMenuFrame frame = new PersonelMainMenuFrame();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new SearchProductFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SearchProductFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    public void searchProducts() throws SQLException { 
        // tabloyu temizliyoruz
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Connection conn = DriverManager.getConnection(PersonelLoginFrame.connector.getConnectionLink(),
                PersonelLoginFrame.connector.getUserName(), PersonelLoginFrame.connector.getPassword());
        Statement stmt = conn.createStatement();

        String ek = "";

        if (titleRadioBTN.isSelected()) {
            ek = "product_title like " + "'" + jTextField1.getText() + "%'";
        } else if (idRadioBTN.isSelected()) {
            ek = "product_id like " + "'" + jTextField1.getText() + "%'";
        } else if (descRadioBTN.isSelected()) {
            ek = "product_description like " + "'" + jTextField1.getText() + "%'";
        }

        String sql = "select product_id,\n"
                + "product_title,\n"
                + "product_price,\n"
                + "product_description,\n"
                + "product_count\n"
                + "from "+PersonelLoginFrame.connector.getProductTableLink()+" where " + ek;
        ResultSet reSSet = stmt.executeQuery(sql);

        while (reSSet.next()) {
            
            String product_id = reSSet.getString("product_id");
            String product_title = reSSet.getString("product_title");
            String product_price = reSSet.getString("product_price");
            String product_description = reSSet.getString("product_description");
            String product_count = reSSet.getString("product_count");

            String[] data = {product_id, product_title, product_price, product_description, product_count};

            model.addRow(data);
        }
        reSSet.close();
        stmt.close();
        conn.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton descRadioBTN;
    private javax.swing.JRadioButton idRadioBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel radButErrorLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchErrorLabel;
    private javax.swing.JRadioButton titleRadioBTN;
    // End of variables declaration//GEN-END:variables
}
