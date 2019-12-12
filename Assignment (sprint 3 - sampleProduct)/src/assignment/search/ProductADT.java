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
public interface ProductADT{
    //name,brand,price
    String getName();
    /*
    Description     : to get product name
    Precondition    : none
    Postcondition   : none
    return          : product name
    */
    
    void setName(String name);
    /*
    Description     : to set product name
    Precondition    : none
    Postcondition   : product name updated
    return          : none
    */
    
    String getCategory();
    /*
    Description     : to get product category
    Precondition    : none
    Postcondition   : none
    return          : product category
    */
    
    void setCategory(String Category);
    /*
    Description     : to set product category
    Precondition    : none
    Postcondition   : product category is updated
    return          : none
    */
    
    String getDescription();
    /*
    Description     : to get product description
    Precondition    : none
    Postcondition   : none
    return          : product description
    */
    
    void setDescription(String description);
    /*
    Description     : to set product category
    Precondition    : none
    Postcondition   : product description is updated
    return          : none
    */
    
    double getPrice();
    /*
    Description     : to get product price
    Precondition    : none
    Postcondition   : none
    return          : product price
    */
    
    void setPrice(double price);
    /*
    Description     : to set product price
    Precondition    : none
    Postcondition   : product price is updated
    return          : none
    */
    int getBarcode();
    /*
    Description     : 
    Precondition    : 
    Postcondition   : 
    return          : 
    */
    
    void setBarcode(int barcode);
    /*
    Description     : 
    Precondition    : 
    Postcondition   : 
    return          : 
    */   
    
    //ADT function
            
}
