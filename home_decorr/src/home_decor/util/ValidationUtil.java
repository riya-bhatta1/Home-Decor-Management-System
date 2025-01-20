/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.util;

/**
 *
 * @author Riya Bhatta
 * 23048574
 */
import java.util.regex.Pattern;

public class ValidationUtil {
    private static final Pattern ID_PATTERN = Pattern.compile("^\\d+$");
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z ]+$");
    private static final Pattern CATEGORY_PATTERN = Pattern.compile("^[a-zA-Z ]+$");
    private static final Pattern PRICE_PATTERN = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
    private static final Pattern STATUS_PATTERN = Pattern.compile("^(Available|Out Of Stock)$");
    private static final Pattern DESCRIPTION_PATTERN = Pattern.compile("^[\\w\\s,.;'\"!?()&-]{1,255}$"); // Description: letters, digits, spaces, and punctuation (max 255 chars)
    private static final Pattern DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$"); // Date: "YYYY-MM-DD"
    private static final Pattern NON_NEGATIVE_INT_PATTERN = Pattern.compile("^\\d+$"); // Integer and cannot be negative

    // validating integer for product id 
    public static boolean isValidProductId(String productId) {
        return productId != null && ID_PATTERN.matcher(productId).matches();
    }
    
    // validating string value for product name
    public static boolean isValidProductName(String productName) {
        return productName != null && NAME_PATTERN.matcher(productName).matches();
    }
    
    // validating string value for category
    public static boolean isValidCategory(String category) {
        return category != null && CATEGORY_PATTERN.matcher(category).matches();
    }
    // validating integer for price
    public static boolean isValidPrice(String price) {
        return price != null && PRICE_PATTERN.matcher(price).matches();
    }
    
    // validating string value for status 
    public static boolean isValidStatus(String status) {
        return status != null && STATUS_PATTERN.matcher(status).matches();
    }
    
    // non negative integer for stock quantity
    public static boolean isValidStockQuantity(String stockQuantity) {
        return stockQuantity != null && NON_NEGATIVE_INT_PATTERN.matcher(stockQuantity).matches();
    }
    
    // non negative integer for sold
    public static boolean isValidSold(String sold) {
        return sold != null && NON_NEGATIVE_INT_PATTERN.matcher(sold).matches();
    }
    
    // Validate Description (letters, digits, spaces, and common punctuation)
    public static boolean isValidDescription(String description) {
        return description != null && !description.trim().isEmpty() && DESCRIPTION_PATTERN.matcher(description).matches();
    }

    // Validate Date (must be in YYYY-MM-DD format)
    public static boolean isValidDate(String date) {
        return date != null && !date.trim().isEmpty() && DATE_PATTERN.matcher(date).matches();
    }
    
    // Check if a string is null or empty
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

}
