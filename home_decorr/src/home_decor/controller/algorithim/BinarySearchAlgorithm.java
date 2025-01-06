/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_decor.controller.algorithim;
import home_decor.model.HomeDecorModel;
import java.util.List;


/**
 *
 * @author Dell
 */
public class BinarySearchAlgorithm {
     public HomeDecorModel searchByName(String searchValue, List
             <HomeDecorModel> studentList,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(studentList.get(mid).getProduct_Name()) == 0) {
            return studentList.get(mid);
        } else if (searchValue.compareToIgnoreCase(studentList.get(mid).getProduct_Name()) < 0) {
            return searchByName(searchValue, studentList, left, mid - 1);
        } else {
            return searchByName(searchValue, studentList, mid + 1, right);
        }

    }
    
}
