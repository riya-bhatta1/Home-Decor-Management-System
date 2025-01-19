/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.controller;


import home_decor.model.HomeDecorModel;
import home_decor.util.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

;
/**
 *
 * @author Riya Bhatta
 * 23048574
 */
public class ProductController {
    private List<HomeDecorModel> productList= new ArrayList<>();
    // Assuming the view and model are passed during initialization
    //private HomeDecor productView;
   // private HomeDecorModel productModel;

    public ProductController() {
        productList = new ArrayList<>();
        //this.productView = view;
        //this.productModel = model;
    }
    //ggg
    
    
    
    
    //
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
        HomeDecorModel product = new HomeDecorModel(
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
    

    public List<HomeDecorModel> getProductList() {
        return productList;
  }
    
    
}



