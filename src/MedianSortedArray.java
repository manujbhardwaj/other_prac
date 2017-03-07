
import java.util.TreeSet;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/
/*
Tough. Not done.
*/
public class MedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < nums1.length; i++)
        {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++)
        {
            set.add(nums2[i]);
        }
        int size = set.size();
        Integer[] arr = new Integer[size];
        arr = set.toArray(arr);
        double ans;
        if(size%2 == 0)
        {
            int a = size/2;
            ans = (double)(arr[a] + arr[a-1])/2;
        }
        else
        {
            int a = (size - 1)/2;
            ans = arr[a];
        }
        return ans;
    }
}
