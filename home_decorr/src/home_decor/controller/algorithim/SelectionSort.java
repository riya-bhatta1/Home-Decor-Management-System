/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.controller.algorithim;
//ggg

import home_decor.model.HomeDecorModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Riya Bhatta
 * 23048574
 */
// It begins the selection sort algorithm for sorting a list of HomeDecorModel objects
public class SelectionSort {
    List<HomeDecorModel> homeDecorSortList;
// A empty array list is created to store the items being sorted    
    public SelectionSort(){
        homeDecorSortList = new ArrayList<>();
    }
    public List<HomeDecorModel> sort(List<HomeDecorModel> productList, boolean isDesc, String sortBy) {
        this.homeDecorSortList.clear();
        this.homeDecorSortList.addAll(productList);
// Validates the list is not null or empty
        if (homeDecorSortList == null || homeDecorSortList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be null or empty.");
        }
// The loop iterates through the list, treating elements from i to the end as the unsorted portion
        for (int i = 0; i < homeDecorSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(homeDecorSortList, i, isDesc,sortBy);
// Swaps method exchanges the vaue at indices i and extremeIndex, if the extremum value is not already at index i
            if (i != extremumIndex) {
                swap(homeDecorSortList, i, extremumIndex);
            }
        }

        return homeDecorSortList;
    }
    //Finds the index of the extremum value (minimum or maximum) in the list from the start index.
    //productSortList the list of ProductModel objects
    //startIndex the index to start searching from
    //isDesc specifies whether to find the maximum (true) or minimum (false)
    //then returns the index of the extremum value
    
    private int findExtremumIndex(List<HomeDecorModel> productSortList, int startIndex, boolean isDesc, String sortBy) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < productSortList.size(); j++) {
            boolean shouldSwap = false;
            if ("Product ID".equalsIgnoreCase(sortBy)){
                shouldSwap = shouldSwap(homeDecorSortList.get(j).getProduct_Id(), homeDecorSortList.get(extremumIndex).getProduct_Id(), isDesc);
            }
            if (shouldSwap) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    
    //Determines whether the current value should replace the current extremum based on sort order.
    //current the current value
    //  extremum the current extremum value
    // isDesc specifies the sort order (true for descending, false for ascending)
    // returns true if the current value should replace the extremum; false otherwise
     
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }
    
    //Swaps two elements in the list.
    // productSortList the list of ProductModel objects
    // i the index of the first element
    // j the index of the second element
    
    private void swap(List<HomeDecorModel> homeDecorSortList, int i, int j) {
        HomeDecorModel temp = homeDecorSortList.get(i);
        homeDecorSortList.set(i, homeDecorSortList.get(j));
        homeDecorSortList.set(j, temp);
    }
}
