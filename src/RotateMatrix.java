/*
Rotate a square matrix
*/

























public class RotateMatrix {
    public void rotate(int[][] arr){
        int[][] newarr = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                newarr[j][i] = arr[arr.length - 1 - i][j];
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(newarr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
