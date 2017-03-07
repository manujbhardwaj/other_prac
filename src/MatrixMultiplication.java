/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuj
 */
public class MatrixMultiplication {
    public void multiplication(int[][] arr1, int[][] arr2){
        if(arr1[0].length != arr2.length)
            System.out.println("Not valid");;
        int[][] arr3 = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                for(int k = 0; k < arr2.length; k++){
                    arr3[i][j] = arr3[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
