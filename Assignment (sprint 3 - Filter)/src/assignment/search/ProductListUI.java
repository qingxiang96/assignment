/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.search;

import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    public ProductADT[] product1 = new ProductList[20];
    int size = 6;
    
    DefaultListModel listModel = new DefaultListModel();
    
    Random dice = new Random();
    String searchType = "name";
    String searchContent = "";
    int count;
   //jList p =new jList();
    /**
     * Creates new form ProductNameLists
     */
    //ProductList productL;
    
    public ProductListUI() {
       initComponents();        
       //AddProductUI p = new AddProductUI();       
       //jLabel1.setText(p.product1.getName());
       //String searchType = "name";
        //  String searchContent = "";
        addList();
    }
    
    public ProductListUI(String name, String category, String description, double price, int barcode) {
        initComponents();
        
        product1[0] = new ProductList(name, category, description, price, barcode);
        addProduct(product1[0].getName());
    }

    private void addList(){        
        //jListProduct.clearSelection();

         listModel.clear();
         count = 0;
         
        ProductArray();
        for(int i = 0 ; i < size ; i ++){
            if(searchType.equals("name")){
                if(searchContent.equals("")||searchContent.equals(product1[i].getName())){
                    addProduct(product1[i].getName());
                    count++;
                }
            }
            else if(searchType.equals("barcode")){
                int barcode = Integer.parseInt(searchContent);
                
                if(searchContent.equals("")|| barcode == product1[i].getBarcode()){
                     addProduct(product1[i].getName());
                     count++;
                }
                
                if(i == size-1 && count == 0){
            
                    
                    JOptionPane.showMessageDialog(null, "Barcode search cannot be found","Error",2);
                    //
                    searchType = "name";
                    searchContent = "";
                    jtxtBarcode.setText("");
                    addList();
                    return;
                }
                
            }
                  
            
        }
        jCount.setText(String.valueOf(count));
    }
    
    private void addProduct(String name){
        jListProduct.setModel(listModel);
        //listModel.addElement("Name\t\tCategory\tDescription");
        //String searchType = "name";
        //  String searchContent = "";
        
        String output = name;
        listModel.addElement(output);
    }
    

    
    public void ProductArray(){
        product1[0] = new ProductList("SUNSILK", "Shampoo", "Soft and smooth shampoo 650ml", 26.50,100101);
        product1[1] = new ProductList("PANTENE", "Shampoo", "Shampoo anti Dandruff 340ml", 11.00,100102);
        product1[2] = new ProductList("ORAL-B", "Toothbrush", "complete sensitive care toothbrush", 4.30,110101);
        product1[3] = new ProductList("COLGATE", "Toothbrush", "360 charcoal 2's", 23.74,110102);
        product1[4] = new ProductList("DARLIE", "Toothpaste", "double action 2x 255g", 15.50,120101);
        product1[5] = new ProductList("COLGATE", "Toothpaste", "charcoal deep clean toothpaste 2x150g", 18.14,120102);
        
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
        jcmbCategory = new javax.swing.JComboBox();
        jcmbBrand = new javax.swing.JComboBox();
        jtxtBarcode = new javax.swing.JTextField();
        jlblBarcode = new javax.swing.JLabel();
        jcmbAttribute = new javax.swing.JComboBox();
        jbtnSearch = new javax.swing.JButton();
        jcmbSelection = new javax.swing.JComboBox();
        jPanelPrice = new javax.swing.JPanel();
        jRadBtn10 = new javax.swing.JRadioButton();
        jRadBtn15 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTxtPriceMin = new javax.swing.JTextField();
        jTxtPriceMax = new javax.swing.JTextField();
        jCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jcmbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "HE", "Item 3", "Item 4" }));
        jcmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCategoryActionPerformed(evt);
            }
        });

        jcmbBrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "SUNSILK", "PANTENE", "ORAL-B", "COLGATE", "DARLIE", "other", "other", "other", "other" }));
        jcmbBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbBrandActionPerformed(evt);
            }
        });

        jtxtBarcode.setToolTipText("");
        jtxtBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBarcodeActionPerformed(evt);
            }
        });

        jlblBarcode.setText("Barcode : ");

        jcmbAttribute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Attribute", "Item 2", "Item 3", "Item 4" }));

        jbtnSearch.setText("Search");
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jcmbSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Category", "Brand Name", "Attribute", "Barcode" }));
        jcmbSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSelectionActionPerformed(evt);
            }
        });

        jPanelPrice.setBorder(javax.swing.BorderFactory.createTitledBorder("Price Range: "));
        jPanelPrice.setToolTipText("");
        jPanelPrice.setName(""); // NOI18N

        jRadBtn10.setText("MYR1 - MYR10");

        jRadBtn15.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        javax.swing.GroupLayout jPanelPriceLayout = new javax.swing.GroupLayout(jPanelPrice);
        jPanelPrice.setLayout(jPanelPriceLayout);
        jPanelPriceLayout.setHorizontalGroup(
            jPanelPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPriceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadBtn10)
                    .addComponent(jRadBtn15)
                    .addComponent(jRadioButton2))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelPriceLayout.setVerticalGroup(
            jPanelPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPriceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadBtn10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadBtn15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTxtPriceMin.setToolTipText("Enter Price Range");
        jTxtPriceMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtPriceMinKeyTyped(evt);
            }
        });

        jTxtPriceMax.setToolTipText("Enter Price Range");
        jTxtPriceMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtPriceMaxKeyTyped(evt);
            }
        });

        jCount.setText("0");

        jLabel1.setText("Total of Results : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcmbSelection, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcmbBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcmbAttribute, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtPriceMax, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtPriceMin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel1))))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jcmbAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtBarcode)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(jTxtPriceMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jTxtPriceMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void custBtnDisable(){
        jbtnAdd.setVisible(false);
        jbtnDelete.setVisible(false);
        jbtnUpdate.setVisible(false);
        jbtnGenerate.setVisible(false);
        searchBtnDisable();
    }
    
        public void searchBtnDisable(){
            jcmbSelection.setVisible(false);
            jcmbCategory.setVisible(false);
            jcmbBrand.setVisible(false);
            jcmbAttribute.setVisible(false);
            jlblBarcode.setVisible(false);
            jtxtBarcode.setVisible(false);
            jCount.setVisible(false);
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
                
        int updateNumber = 0;
        
        for(int i = 0 ; i < size ; i++){
            if(product1[i].getName().equals(searchContent))
                updateNumber = i;
        }
        
                for(int i = 0 ; i < size ; i ++){
            if(searchType.equals("name")){
                if(product1[i].getName().equals(searchContent))
                updateNumber = i;
            }
            
            else if(searchType.equals("barcode")){
                int barcode = Integer.parseInt(searchContent);
                
                if(barcode == product1[i].getBarcode()){
                     updateNumber = i;
                }
            }
        }
        
        
        
                
                new AddProductUI(product1[updateNumber].getName(),product1[updateNumber].getCategory(),product1[updateNumber].getDescription(),product1[updateNumber].getPrice(),product1[updateNumber].getBarcode()).setVisible(true);
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

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        // TODO add your handling code here:
                searchBtnDisable();
        jcmbSelection.setVisible(true);
        
        //vvvvvvvvvv  priceRange filter  vvvvvvvvvv
        int priceMin = Integer.parseInt(jTxtPriceMin.getText());
        int priceMax = Integer.parseInt(jTxtPriceMax.getText());
        if(priceMax < priceMin){
            JOptionPane.showMessageDialog(null, "Max price must be higher than min price! ", "Error", 2);
            jTxtPriceMax.setText("");jTxtPriceMax.grabFocus();
        }else if(priceMin < priceMax){
            listModel.clear();//clear List
            for(int k=0;k<size;k++){
                if(product1[k].getPrice() <= priceMax && product1[k].getPrice() >= priceMin){
                    addProduct(product1[k].getName());
                }
            }
        }
        //^^^^^^^^^^  priceRange filter  ^^^^^^^^^^
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jcmbSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSelectionActionPerformed
        // TODO add your handling code here:
        String selection = jcmbSelection.getModel().getSelectedItem().toString();
        
        if(selection.equals("Category")){
            jcmbCategory.setVisible(true);
        }
        else if(selection.equals("Brand Name")){
            jcmbBrand.setVisible(true);
        }
        else if(selection.equals("Attribute")){
            jcmbAttribute.setVisible(true);
        }
        else if(selection.equals("Barcode")){
            jlblBarcode.setVisible(true);
            jtxtBarcode.setVisible(true);
        }
        
        
        jcmbSelection.setVisible(false);
    }//GEN-LAST:event_jcmbSelectionActionPerformed

    private void jcmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCategoryActionPerformed
        // TODO add your handling code here:
        String category = jcmbCategory.getModel().getSelectedItem().toString();
        if(category.equals("HE")){
           searchContent = "HE";
        }


        addList();

        
    }//GEN-LAST:event_jcmbCategoryActionPerformed

    private void jTxtPriceMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPriceMinKeyTyped
        //vvvvvvvvvv   priceRange Force Number input(Min Price)   vvvvvvvvvv
        char price = evt.getKeyChar();
        if(!(Character.isDigit(price))
            ||(price == KeyEvent.VK_BACK_SPACE)
            ||(price == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }//^^^^^^^^^^   priceRange Force Number input(Min Price)   ^^^^^^^^^^
    }//GEN-LAST:event_jTxtPriceMinKeyTyped

    private void jTxtPriceMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPriceMaxKeyTyped
        //vvvvvvvvvv   priceRange Force Number input(Max Price)   vvvvvvvvvv
        char price = evt.getKeyChar();
        if(!(Character.isDigit(price))
            ||(price == KeyEvent.VK_BACK_SPACE)
            ||(price == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }//^^^^^^^^^^   priceRange Force Number input(Max Price)   ^^^^^^^^^^
    }//GEN-LAST:event_jTxtPriceMaxKeyTyped

    private void jcmbBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbBrandActionPerformed
        // TODO add your handling code here:
        String brand = jcmbBrand.getModel().getSelectedItem().toString();
        searchType = "name";
        if(brand.equals("SUNSILK")){
           searchContent = "SUNSILK";
        }
        else if(brand.equals("PANTENE")){
            searchContent = "PANTENE";
        }
        else if(brand.equals("ORAL-B")){
            searchContent = "ORAL-B";
        }
        else if(brand.equals("COLGATE")){
            searchContent = "COLGATE";
        }

        jCount.setVisible(true);

        
        addList();
    }//GEN-LAST:event_jcmbBrandActionPerformed

    private void jtxtBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBarcodeActionPerformed
        // TODO add your handling code here:
                
        Pattern p = Pattern.compile("[^0-9, ]");
        Matcher m = p.matcher(jtxtBarcode.getText());
        boolean b = m.find();


        
        
        if(jtxtBarcode.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Barcode search cannot be empty","Error",2);
            jtxtBarcode.setText("");

        }
        else if(b){
            JOptionPane.showMessageDialog(null, "Barcode search contain special character","Error",2);
            jtxtBarcode.setText("");
        }
        else if(jtxtBarcode.getText().contains(" ")){
            JOptionPane.showMessageDialog(null, "Barcode search contain spacebar","Error",2);
            jtxtBarcode.setText("");
        }
        else if(jtxtBarcode.getText().length() != 6){
            JOptionPane.showMessageDialog(null, "Barcode search less or greater than 6 digit","Error",2);
            jtxtBarcode.setText("");
        }
        else{
            
            searchType = "barcode";
            searchContent = jtxtBarcode.getText();
           
        }
        

         addList();




    }//GEN-LAST:event_jtxtBarcodeActionPerformed

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
    private javax.swing.JLabel jCount;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JList jListProduct;
    private javax.swing.JPanel jPanelPrice;
    private javax.swing.JRadioButton jRadBtn10;
    private javax.swing.JRadioButton jRadBtn15;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtPriceMax;
    private javax.swing.JTextField jTxtPriceMin;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnGenerate;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox jcmbAttribute;
    private javax.swing.JComboBox jcmbBrand;
    private javax.swing.JComboBox jcmbCategory;
    private javax.swing.JComboBox jcmbSelection;
    private javax.swing.JLabel jlblBarcode;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTextField jtxtBarcode;
    // End of variables declaration//GEN-END:variables
}