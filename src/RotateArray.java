/*
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

Array 1 2 3 4 5 6 7

Rotation of the above array by 2 will make array
3 4 5 6 7 1 2 3
ArrayRotation1 
*/




















public class RotateArray {
    void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
}
