/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.model;

/**
 *
 * @author Riya Bhatta
 * 23048574
 */
public class HomeDecorModel {
    private int product_Id;
    private String product_name;
    private String category;
    private double price;
    private String status;
    private String description;
    private int stockQuantity;
    private int sold;
    private String date;
    
   /**
    * Constructor method for HomeDecorModel class
    * @param product_Id The unique identifier for product ID
    * @param product_name unique identifier for product name
    * @param category unique identifier for category
    * @param price unique identifier for price
    * @param status unique identifier for status
    * @param description unique identifier for description
    * @param stockQuantity unique identifier for stock quantity
    * @param sold unique identifier for sold
    * @param date unique identifier for date
    */ 
    public HomeDecorModel(int product_Id, String product_name, String category, double price, String status, String description,int stockQuantity, int sold, String date){
        this.product_Id = product_Id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.status = status;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.sold=sold;
        this.date = date;
             
    }
    
    // Getter method for retrieving the product ID
    public int getProduct_Id(){
        return product_Id;
    }
    // Setter method for updating product ID
    public void setProduct_Id(int product_Id){
        this.product_Id = product_Id;
    }
    // Getter method for retrieving the product_name
    public String getProduct_Name(){
        return product_name;
    }
    // Setter method for updating product name
    public void setProduct_Name(String product_name){
        this.product_name = product_name;
    }
    // Getter method for retrieving the category
    public String getCategory(){
        return category;
    }
    // Setter method for updating category
    public void setCategory(String category){
        this.category = category;
    }
    // Getter method for retrieving the price
    public double getPrice(){
        return price;
    }
    // Setter method for updating price
    public void setPrice(double price){
        this.price = price;
    }
    // Getter method for retrieving the status
    public String getStatus(){
        return status;
    }
    // Setter method for updating status
    public void setStatus(String status){
        this.status = status;
    }
    // Getter method for retrieving the description
    public String getDescription(){
        return description;
    }
    // Setter method for updating description
    public void setDescription(String description){
        this.description = description;
    }
    // Getter method for retrieving the stock quantity
    public int getStockQuantity(){
        return stockQuantity;
    }
    // Setter method for updating stock quantity
    public void setStockQuantity(int stockQuantity){
        this. stockQuantity= stockQuantity;
    }
    // Getter method for retrieving sold items
    public int getSold(){
        return sold;
    }
    // Setter method for updating sold items
    public void setSold(int sold){
        this.sold = sold;
    }
    // Getter method for retrieving date
    public String getDate(){
        return date;
    }
    // Setter method for updating date
    public void setDate(String date){
        this.date = date;
    }
    
    
    
    
    
    
}
