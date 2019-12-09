/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.search;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author OEM
 */
public class ProductListUI extends javax.swing.JFrame {
    public ProductADT[] product1 = new ProductList[10];
    
    DefaultListModel listModel = new DefaultListModel();
    
    Random dice = new Random();
    
   //jList p =new jList();
    /**
     * Creates new form ProductNameLists
     */
    //ProductList productL;
    
    public ProductListUI() {
       initComponents();
        
       //AddProductUI p = new AddProductUI();
       
       //jLabel1.setText(p.product1.getName());
       
    }
    


    public ProductListUI(String name, String category, String description, double price) {
         initComponents();
        
        product1[0] = new ProductList(name, category, description, price);
        addProduct(product1[0].getName(),product1[0].getCategory(),product1[0].getDescription());
    }

    private void addProduct(String name,String category, String description){
        jListProduct.setModel(listModel);
        //listModel.addElement("Name\t\tCategory\tDescription");
        listModel.addElement(name + "\t\t" + category + "\t\t" + description);
    }
    
     public ProductListUI(boolean status) {
       initComponents();
       if(status == false){
           System.out.println(status);
       jbtnAdd.setVisible(false);
       jbtnAdd.setEnabled(status);
       jbtnUpdate.setVisible(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jListProduct = new javax.swing.JList();
        jlblTitle = new javax.swing.JLabel();
        jbtnAdd = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnGenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListProduct);

        jlblTitle.setBackground(new java.awt.Color(255, 255, 255));
        jlblTitle.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitle.setText("Product Lists");
        jlblTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnGenerate.setText("Generate barcode");
        jbtnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnGenerate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jbtnGenerate)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void custBtnDisable(){
        jbtnAdd.setVisible(false);
        jbtnDelete.setVisible(false);
        jbtnUpdate.setVisible(false);
        jbtnGenerate.setVisible(false);
    }
    
    
    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        // TODO add your handling code here:
        //UserInterface.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductUI().setVisible(true);
            }
        });
        this.setVisible(false);

    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // TODO add your handling code here:
       // jListDisplayName.remove;
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductUI(product1[0].getName()).setVisible(true);
            }
        });
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerateActionPerformed
        // TODO add your handling code here:
            if(product1[0] == null){
                JOptionPane.showMessageDialog(null, "No item selected to generate barcode!","Error",2);
              
            }
            else{
                String barcode;
        
        
        barcode = "PA010" + dice.nextInt(6);
        
                 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductUI(product1[0].getName(),barcode).setVisible(true);
            }
        });
        this.setVisible(false);
            }
        
        
    }//GEN-LAST:event_jbtnGenerateActionPerformed

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
            java.util.logging.Logger.getLogger(ProductListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ProductListUI().setVisible(true);
         
         }
        });
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList jListProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnGenerate;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JLabel jlblTitle;
    // End of variables declaration//GEN-END:variables
}
