/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.search;

/**
 *
 * @author OEM
 */
public class ProductList implements ProductADT {

    
    private String name;
    private String category;
    private String description;
    private double price;
    private int barcode;


    public ProductList(){

    }

    public ProductList(String name, String category, String description, double price, int barcode) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.barcode = barcode;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //ADT function
    

    
    
   
    


 
  


    
}
