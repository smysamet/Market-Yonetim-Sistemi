/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TURKTRUST
 */
public class PersonelMainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form ShowProducts
     */
    public PersonelMainMenuFrame() {
        initComponents();
        this.getContentPane().setBackground(new Color(56, 56, 56));
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        showStoresButton = new javax.swing.JButton();
        searchStoreButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(56, 56, 56));

        showButton.setBackground(new java.awt.Color(142, 184, 250));
        showButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        showButton.setForeground(new java.awt.Color(255, 255, 255));
        showButton.setText("Show Products");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(142, 184, 250));
        searchButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search Product");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        showStoresButton.setBackground(new java.awt.Color(223, 94, 255));
        showStoresButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        showStoresButton.setForeground(new java.awt.Color(255, 255, 255));
        showStoresButton.setText("Show Stores");
        showStoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStoresButtonActionPerformed(evt);
            }
        });

        searchStoreButton.setBackground(new java.awt.Color(223, 94, 255));
        searchStoreButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchStoreButton.setForeground(new java.awt.Color(255, 255, 255));
        searchStoreButton.setText("Search Store");
        searchStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStoreButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showStoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchStoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showStoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchStoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        try {
            // TODO add your handling code here:
            ShowProductsFrame showProd = new ShowProductsFrame();
            showProd.setLocationRelativeTo(null);
            showProd.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PersonelMainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_showButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            SearchProductFrame searFram = new SearchProductFrame();
            searFram.setLocationRelativeTo(null);
            searFram.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelMainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void showStoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStoresButtonActionPerformed
        try {
            ShowStoresFrame shoStoFra = new ShowStoresFrame();
            shoStoFra.setLocationRelativeTo(null);
            shoStoFra.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelMainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showStoresButtonActionPerformed

    private void searchStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStoreButtonActionPerformed
        try {
            SearchStoreFrame frame = new SearchStoreFrame();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchStoreButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelMainMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchStoreButton;
    private javax.swing.JButton showButton;
    private javax.swing.JButton showStoresButton;
    // End of variables declaration//GEN-END:variables
}