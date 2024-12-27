/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.controller;

//import java.io.*;
import home_decor.model.home_decor_model;
import home_decor.util.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

;
/**
 *
 * @author Dell
 */
public class ProductController {
    private List<home_decor_model> productList= new ArrayList<>();

    public ProductController() {
        productList = new ArrayList<>();
    }

    public boolean addProduct(String productId,String productName,String category,String price,String status,String description,String stockQuantity,String sold,String date) {
        if (!ValidationUtil.isValidProductId(productId) ||
            !ValidationUtil.isValidProductName(productName) ||
            !ValidationUtil.isValidCategory(category) ||
            !ValidationUtil.isValidPrice(price) ||
            !ValidationUtil.isValidStatus(status) ||
            !ValidationUtil.isValidDescription(description) ||
            !ValidationUtil.isValidStockQuantity(stockQuantity) ||
            !ValidationUtil.isValidSold(sold) ||
            !ValidationUtil.isValidDate(date))
        {
            return false;
        }
        
        // ggg
        home_decor_model product = new home_decor_model(
                Integer.parseInt(productId),
                productName,
                category,
                Double.parseDouble(price),
                status,
                description,
                Integer.parseInt(stockQuantity),
                Integer.parseInt(sold),
                //Integer.parseInt(date)
                date// Assuming date format is YYYYMMDD
            );

        // Add the product to the product list
        productList.add(product);
        
        
                return true;
    
    }
        //
    
        
        
 
    

    
        
    

    //
    
    //
    
    
        

    public List<home_decor_model> getProductList() {
        return productList;
  }
    
    
}



