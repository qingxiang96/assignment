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
public interface ProductADT {
    
    ProductADT addProduct(ProductADT product);
    /*
    Description     : to add a product
    Precondition    : product is not null
    Postcondition   : product is added
    return          : none
    */
    
    ProductADT addProductPicture(ProductADT picture);
    /*
    Description     : to add product picture
    Precondition    : picture is not null
    Postcondition   : product picture is added
    return          : none
    */
    
    ProductADT viewProductList(ProductADT product);
    /*
    Description     : to view product name
    Precondition    : product is not null
    Postcondition   : product name showed
    return          : the product name
    */
            
    ProductADT removeProduct(ProductADT product);
    /*
    Description     : to remove product
    Precondition    : product is not null
    Postcondition   : product be removed
    return          : none
    */
            
    ProductADT selectProduct(ProductADT product);
    /*
    Description     : to select product
    Precondition    : product is not null
    Postcondition   : product be selected
    return          : none
    */
            
}
