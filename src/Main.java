
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuj
 */
public class Main {
    public static void main(String[] args){
        UniqueString twoSum = new UniqueString();
        int[][] arr1 = 
        {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int[][] arr2 = 
        {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[][] arr3 = 
        {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        System.out.println(twoSum.checkUnique("aditya"));
    }
}
