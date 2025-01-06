/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.controller.algorithim;
import home_decor.model.HomeDecorModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Riya Bhatta
 * 23048574
 */
// InsertionSort class implements the insertion sort algorithm ofr sorting list of HomeDecorModel objects
public class InsertionSort {
// A private list is used to hole a copy of the list to be sorted
    private List<HomeDecorModel> homeDecorSortList;
// Initializes the homeDecorSortList as an empty ArrayList
    public InsertionSort() {
        homeDecorSortList = new ArrayList<>();
    }
// productList is the list to be sorted
// isDesc indicates whether the sort should be in descendnig order
// sortBy indicates the field name by which to sort
    public List<HomeDecorModel> sort(List<HomeDecorModel> productList, boolean isDesc, String sortBy) {
        homeDecorSortList.clear();
        homeDecorSortList.addAll(productList);
// Validates that the input list is not null, otherwise throws an exception
        if (homeDecorSortList == null || homeDecorSortList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be null or empty.");
        }
/* Iterates through the list starting from the second element (i=1), treating it as 'key' to compare. 
The variable j is used to traverse backward through sorted section*/
        for (int i = 1; i < homeDecorSortList.size(); i++) {
            HomeDecorModel key = homeDecorSortList.get(i);
            int j = i - 1;
/* Compares the key with the sorted element j>=0. If the condition shouldSwap is true, 
shifts elements one position to right to make space for the key */
            while (j >= 0 && shouldSwap(homeDecorSortList.get(j), key, isDesc, sortBy)) {
                homeDecorSortList.set(j + 1, homeDecorSortList.get(j));
                j--;
            }
// Places the key in its corrected position within the sorted portion of the llist
            homeDecorSortList.set(j + 1, key);
        }

        return homeDecorSortList;
    }
// Determines whether two elements should be swapped based in the sort criteria
    private boolean shouldSwap(HomeDecorModel current, HomeDecorModel key, boolean isDesc, String sortBy) {
        int comparison = 0;
        if ("Product Name".equalsIgnoreCase(sortBy)) {
            comparison = current.getCategory().compareToIgnoreCase(key.getCategory());
        } 
// Returns true if the elements should be swapped
        return isDesc ? comparison < 0 : comparison > 0;
    }
}
