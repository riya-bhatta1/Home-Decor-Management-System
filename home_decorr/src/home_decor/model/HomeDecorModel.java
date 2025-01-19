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
    //product_id
    public int getProduct_Id(){
        return product_Id;
    }
    public void setProduct_Id(int product_Id){
        this.product_Id = product_Id;
    }
    //product_name
    public String getProduct_Name(){
        return product_name;
    }
    public void setProduct_Name(String product_name){
        this.product_name = product_name;
    }
    //category
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    //price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    //status
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    //description
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    //stock quantity
    public int getStockQuantity(){
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity){
        this. stockQuantity= stockQuantity;
    }
    //sold
    public int getSold(){
        return sold;
    }
    public void setSold(int sold){
        this.sold = sold;
    }
    //date
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    //
    
    //
    
    
    
    
    
}
