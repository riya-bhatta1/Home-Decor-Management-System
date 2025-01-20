/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.controller.algorithim;

import home_decor.model.HomeDecorModel;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author Riya Bhatta
 * 23048574
 */
public class BinarySearchAlgorithm {
  
        public int searchByName (String searchValue, List<HomeDecorModel> productList, int left, int right){
            if (productList == null || productList.isEmpty()){
                throw new IllegalArgumentException ("Product list cannot be null or empty. ");
            }
        
        productList.sort(Comparator.comparing(
           product -> product.getProduct_Name().trim().toLowerCase()
        
        ));
        
        String anySearchValue = searchValue.trim().toLowerCase();

        while (left <= right){
            int mid = left + (right - left) / 2;
            HomeDecorModel midProduct = productList.get(mid);
            
            String normalizeMidValue = midProduct.getProduct_Name().trim().toLowerCase();
            
            System.out.println("Comparing: " + normalizeMidValue + " with " + anySearchValue);
            
            int comparisonResult = normalizeMidValue.compareTo(anySearchValue);
            
            if (comparisonResult == 0){
                return mid;
            } else if (comparisonResult < 0){
                left = mid+1;
            } else {
                right = mid -1;
            }
        } 
        return -1;
         
    }
    
}
