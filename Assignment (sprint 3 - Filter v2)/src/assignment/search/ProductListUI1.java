/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.search;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.DefaultRowSorter;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author OEM
 */
public class ProductListUI1 extends javax.swing.JFrame {

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
    public ProductListUI1() {
        initComponents();
        addRowToJTable();
        //AddProductUI p = new AddProductUI();       
        //jLabel1.setText(p.product1.getName());
        //String searchType = "name";
        //  String searchContent = "";
        addList();
        newFilter();
        jTable1.setAutoCreateRowSorter(true);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jTable1.getModel());
        sorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
        jTable1.setRowSorter(sorter);
        int double_Column = 2;
        sorter.setComparator(double_Column, new Comparator<Double>() {
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }

        });
        jTable1.setRowSorter(sorter);
    }

    public ProductListUI1(String name, String category, String description, double price, int barcode) {
        initComponents();

        product1[0] = new ProductList(name, category, description, price, barcode);
    }

    private void newFilter() {
        RowFilter<DefaultTableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(jTextField1.getText(), 0);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jTable1.getModel());
        sorter.setRowFilter(rf);
    }

    private void addList() {
        //jListProduct.clearSelection();

        listModel.clear();
        count = 0;

        ProductArray();
        for (int i = 0; i < size; i++) {
            if (searchType.equals("name")) {
            } else if (searchType.equals("barcode")) {
                int barcode = Integer.parseInt(searchContent);

                if (i == size - 1 && count == 0) {

                    JOptionPane.showMessageDialog(null, "Barcode search cannot be found", "Error", 2);
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

    public void ProductArray() {
        product1[0] = new ProductList("SUNSILK", "Shampoo", "Soft and smooth shampoo 650ml #adult", 26.50, 100101);
        product1[1] = new ProductList("PANTENE", "Shampoo", "Shampoo anti Dandruff 340ml #adult#sensitiveskin", 11.00, 100102);
        product1[2] = new ProductList("ORAL-B", "Toothbrush", "complete sensitive care toothbrush #child", 4.30, 110101);
        product1[3] = new ProductList("COLGATE", "Toothbrush", "360 charcoal 2's #sensitiveskin", 23.74, 110102);
        product1[4] = new ProductList("DARLIE", "Toothpaste", "double action 2x 255g #child#sensitiveskin", 15.50, 120101);
        product1[5] = new ProductList("COLGATE", "Toothpaste", "charcoal deep clean toothpaste 2x150g #adult#child", 18.14, 120102);

    }

    public ArrayList ListProduct() {
        ArrayList<ProductList> list = new ArrayList<ProductList>();
        ProductList p1 = new ProductList("SUNSILK", "Shampoo", "Soft and smooth shampoo 650ml #adult", 26.50, 100101);
        ProductList p2 = new ProductList("PANTENE", "Shampoo", "Shampoo anti Dandruff 340ml #adult#sensitiveskin", 11.00, 100102);
        ProductList p3 = new ProductList("ORAL-B", "Toothbrush", "complete sensitive care toothbrush #child", 4.30, 110101);
        ProductList p4 = new ProductList("COLGATE", "Toothbrush", "360 charcoal 2's #sensitiveskin", 23.74, 110102);
        ProductList p5 = new ProductList("DARLIE", "Toothpaste", "double action 2x 255g #child#sensitiveskin", 15.50, 120101);
        ProductList p6 = new ProductList("COLGATE", "Toothpaste", "charcoal deep clean toothpaste 2x150g #adult#child", 18.14, 120102);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        return list;
    }

    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<ProductList> list = ListProduct();
        Object rowData[] = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getName();
            rowData[1] = list.get(i).getCategory();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getBarcode();
            model.addRow(rowData);
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
        jCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelAttri = new javax.swing.JPanel();
        jChkBoxAdult = new javax.swing.JCheckBox();
        jChkBoxChild = new javax.swing.JCheckBox();
        jChkBoxSens = new javax.swing.JCheckBox();
        jLabelPriceRange = new javax.swing.JLabel();
        jTxtPriceMin = new javax.swing.JTextField();
        jLabelPriceRangeTo = new javax.swing.JLabel();
        jTxtPriceMax = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jCount.setText("0");

        jLabel1.setText("Total of Results : ");

        jPanelAttri.setBorder(javax.swing.BorderFactory.createTitledBorder("Attributes: "));
        jPanelAttri.setToolTipText("");
        jPanelAttri.setName(""); // NOI18N

        jChkBoxAdult.setSelected(true);
        jChkBoxAdult.setText("Adult");

        jChkBoxChild.setSelected(true);
        jChkBoxChild.setText("Child");

        jChkBoxSens.setText("Sensitive Skin");

        jLabelPriceRange.setText("Price Range: ");

        jTxtPriceMin.setText("0");
        jTxtPriceMin.setToolTipText("Enter your minimum price range");
        jTxtPriceMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtPriceMinKeyTyped(evt);
            }
        });

        jLabelPriceRangeTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPriceRangeTo.setText("to");

        jTxtPriceMax.setText("99999");
        jTxtPriceMax.setToolTipText("Enter your maximum price range");
        jTxtPriceMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtPriceMaxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelAttriLayout = new javax.swing.GroupLayout(jPanelAttri);
        jPanelAttri.setLayout(jPanelAttriLayout);
        jPanelAttriLayout.setHorizontalGroup(
            jPanelAttriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAttriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAttriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAttriLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTxtPriceMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPriceRangeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPriceMax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPriceRange)
                    .addComponent(jChkBoxAdult)
                    .addComponent(jChkBoxChild)
                    .addComponent(jChkBoxSens))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelAttriLayout.setVerticalGroup(
            jPanelAttriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAttriLayout.createSequentialGroup()
                .addComponent(jChkBoxAdult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChkBoxChild)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChkBoxSens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPriceRange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAttriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPriceMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPriceMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPriceRangeTo))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Category", "Price", "Barcode"
            }
        ));
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jTable1.setEnabled(false);
        jScrollPane2.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Search Filter:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelAttri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcmbBrand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcmbCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcmbSelection, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addComponent(jcmbAttribute, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jbtnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnGenerate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(jCount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jcmbAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelAttri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtBarcode)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void custBtnDisable() {
        jbtnAdd.setVisible(false);
        jbtnDelete.setVisible(false);
        jbtnUpdate.setVisible(false);
        jbtnGenerate.setVisible(false);
        searchBtnDisable();
    }

    public void searchBtnDisable() {
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

                for (int i = 0; i < size; i++) {
                    if (product1[i].getName().equals(searchContent)) {
                        updateNumber = i;
                    }
                }

                for (int i = 0; i < size; i++) {
                    if (searchType.equals("name")) {
                        if (product1[i].getName().equals(searchContent)) {
                            updateNumber = i;
                        }
                    } else if (searchType.equals("barcode")) {
                        int barcode = Integer.parseInt(searchContent);

                        if (barcode == product1[i].getBarcode()) {
                            updateNumber = i;
                        }
                    }
                }

                new AddProductUI(product1[updateNumber].getName(), product1[updateNumber].getCategory(), product1[updateNumber].getDescription(), product1[updateNumber].getPrice(), product1[updateNumber].getBarcode()).setVisible(true);
            }
        });
        this.setVisible(false);

    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerateActionPerformed
        // TODO add your handling code here:
        if (product1[0] == null) {
            JOptionPane.showMessageDialog(null, "No item selected to generate barcode!", "Error", 2);

        } else {
            String barcode;

            barcode = "PA010" + dice.nextInt(6);

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new AddProductUI(product1[0].getName(), barcode).setVisible(true);
                }
            });
            this.setVisible(false);
        }


    }//GEN-LAST:event_jbtnGenerateActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        // TODO add your handling code here:
        searchBtnDisable();
        jcmbSelection.setVisible(true);

        //vvvvvvvvvv  priceRange + Attribute filter  vvvvvvvvvv
        if (jTxtPriceMin.getText().isEmpty()) {
            jTxtPriceMin.setText("0");
        }
        if (jTxtPriceMax.getText().isEmpty()) {
            jTxtPriceMax.setText("0");
        }
        int priceMin = Integer.parseInt(jTxtPriceMin.getText());
        int priceMax = Integer.parseInt(jTxtPriceMax.getText());
        if (priceMax < priceMin) {
            JOptionPane.showMessageDialog(null, "Max price must be higher than min price! ", "Error", 2);
            jTxtPriceMax.setText("");
            jTxtPriceMax.grabFocus();
        } else if (priceMin <= priceMax) {
            listModel.clear();//clear List first
        }//^^^^^^^^^^  priceRange + Attribute filter  ^^^^^^^^^^
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jcmbSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSelectionActionPerformed
        // TODO add your handling code here:
        String selection = jcmbSelection.getModel().getSelectedItem().toString();

        if (selection.equals("Category")) {
            jcmbCategory.setVisible(true);
        } else if (selection.equals("Brand Name")) {
            jcmbBrand.setVisible(true);
        } else if (selection.equals("Attribute")) {
            jcmbAttribute.setVisible(true);
        } else if (selection.equals("Barcode")) {
            jlblBarcode.setVisible(true);
            jtxtBarcode.setVisible(true);
        }

        jcmbSelection.setVisible(false);
    }//GEN-LAST:event_jcmbSelectionActionPerformed

    private void jcmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCategoryActionPerformed
        // TODO add your handling code here:
        String category = jcmbCategory.getModel().getSelectedItem().toString();
        if (category.equals("HE")) {
            searchContent = "HE";
        }

        addList();


    }//GEN-LAST:event_jcmbCategoryActionPerformed

    private void jcmbBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbBrandActionPerformed
        // TODO add your handling code here:
        String brand = jcmbBrand.getModel().getSelectedItem().toString();
        searchType = "name";
        if (brand.equals("SUNSILK")) {
            searchContent = "SUNSILK";
        } else if (brand.equals("PANTENE")) {
            searchContent = "PANTENE";
        } else if (brand.equals("ORAL-B")) {
            searchContent = "ORAL-B";
        } else if (brand.equals("COLGATE")) {
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

        if (jtxtBarcode.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Barcode search cannot be empty", "Error", 2);
            jtxtBarcode.setText("");

        } else if (b) {
            JOptionPane.showMessageDialog(null, "Barcode search contain special character", "Error", 2);
            jtxtBarcode.setText("");
        } else if (jtxtBarcode.getText().contains(" ")) {
            JOptionPane.showMessageDialog(null, "Barcode search contain spacebar", "Error", 2);
            jtxtBarcode.setText("");
        } else if (jtxtBarcode.getText().length() != 6) {
            JOptionPane.showMessageDialog(null, "Barcode search less or greater than 6 digit", "Error", 2);
            jtxtBarcode.setText("");
        } else {

            searchType = "barcode";
            searchContent = jtxtBarcode.getText();

        }

        addList();


    }//GEN-LAST:event_jtxtBarcodeActionPerformed

    private void jTxtPriceMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPriceMinKeyTyped
        char price = evt.getKeyChar();
        if (!(Character.isDigit(price))
                || (price == KeyEvent.VK_BACK_SPACE)
                || (price == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtPriceMinKeyTyped

    private void jTxtPriceMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPriceMaxKeyTyped
        char price = evt.getKeyChar();
        if (!(Character.isDigit(price))
                || (price == KeyEvent.VK_BACK_SPACE)
                || (price == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTxtPriceMaxKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProductListUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductListUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductListUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductListUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductListUI1().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jChkBoxAdult;
    private javax.swing.JCheckBox jChkBoxChild;
    private javax.swing.JCheckBox jChkBoxSens;
    private javax.swing.JLabel jCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPriceRange;
    private javax.swing.JLabel jLabelPriceRangeTo;
    private javax.swing.JPanel jPanelAttri;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
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
