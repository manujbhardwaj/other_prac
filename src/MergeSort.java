/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuj
 */
public class MergeSort {
    public void mergeSort(int[] arr)
    {
        sort(arr, 0, arr.length);
    }
    void sort(int[] arr, int l, int r)
    {
        if(l < r)
        {
            int m = (l + r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    void merge(int[] arr, int l, int m, int r)
    {
        int a = m - l + 1;
        int b = r - m;
        
        int[] L = new int[a];
        int[] R = new int[b];
        
        for(int i = 0; i < a; i++)
        {
            L[i] = arr[i + l];
        }
        for(int i = 0; i < b; i++)
        {
            R[i] = arr[i + m + 1];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while(i < a && j < b)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[i] = R[j];
                j++;
            }
            k++;
        }
        while(i < a)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < b)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
