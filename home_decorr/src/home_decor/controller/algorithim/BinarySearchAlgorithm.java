/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.controller.algorithim;
import home_decor.model.HomeDecorModel;
import java.util.List;


/**
 *
 * @author Riya Bhatta
 * 23048574
 */
public class BinarySearchAlgorithm {
     public int searchByName(String searchValue, List<HomeDecorModel> productList, int left, int right) {
        if (productList == null || productList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be null or empty.");
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            HomeDecorModel midProduct = productList.get(mid);
            
            // Debugging: Print the middle product name and the comparison
        System.out.println("Comparing: " + midProduct.getProduct_Name() + " with " + searchValue);

            int comparisonResult = midProduct.getProduct_Name().compareToIgnoreCase(searchValue);

            if (comparisonResult == 0) {
                return mid; // Found the product
            } else if (comparisonResult < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Not found
    }
    
}
