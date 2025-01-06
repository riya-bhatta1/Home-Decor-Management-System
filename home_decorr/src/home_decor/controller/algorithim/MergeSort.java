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
// It begins the merge sort algorithm for sorting a list of HomeDecorModel objects
/* isDesc flag is passed to specify whether the list should be sorted in descending order (if true) 
or ascending order (if false)*/

public class MergeSort {
    public List<HomeDecorModel> sort(List<HomeDecorModel> productList, boolean isDesc) {
// Validates that the product list is not null or empty
        if (productList == null || productList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be null or empty.");
        }

        return mergeSort(productList, isDesc);
    }
    
/* Checks whether the list has one or zero elements, if it is then it is already sorted
    so the method returns the list as it is */
    private List<HomeDecorModel> mergeSort(List<HomeDecorModel> list, boolean isDesc) {
        if (list.size() <= 1) {
            return list;
        }
// If the list has more than one element, it splits the list into two halves : left and right
// It then recursively sorts both halves by calling mergeSort on each
// After both halves are sorted, it merges them by calling merge method
        int mid = list.size() / 2;

        List<HomeDecorModel> left = new ArrayList<>(list.subList(0, mid));
        List<HomeDecorModel> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        return merge(left, right, isDesc);
    }
// This method merges two sorted list : left and right into a single sorted list
// It compares both halves and adding the smaller or larger element to the merged list

    private List<HomeDecorModel> merge(List<HomeDecorModel> left, List<HomeDecorModel> right, boolean isDesc) {
        List<HomeDecorModel> merged = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            boolean shouldTakeFromLeft = isDesc
                    ? left.get(leftIndex).getPrice() > right.get(rightIndex).getPrice()
                    : left.get(leftIndex).getPrice() < right.get(rightIndex).getPrice();

            if (shouldTakeFromLeft) {
                merged.add(left.get(leftIndex));
                leftIndex++;
            } else {
                merged.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex));
            rightIndex++;
        }

        return merged;
    }
}
