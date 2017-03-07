
import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers, and a number ‘sum’, 
find the number of pairs of integers in the array whose sum is equal to ‘sum’. 
*/



















public class PairSum {
    public int getPairsCount(int[] arr, int sum)
    {
        int count = 0;

        for (int i=0; i<arr.length-1; i++)
            for (int j=i+1; j<arr.length; j++)
                if (arr[i]+arr[j] == sum)
                    count++;

        return count;
    }
    
    boolean hasArrayTwoCandidates(int[] A, int sum)
    {
        int l, r;

        Arrays.sort(A);

        l = 0;
        r = A.length-1; 
        while (l < r)
        {
             if(A[l] + A[r] == sum)
                  return true; 
             else if(A[l] + A[r] < sum)
                  l++;
             else // A[i] + A[j] > sum
                  r--;
        }    
        return false;
    }
    
    int getPairsCount2(int[] arr, int sum)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store counts of all elements in map m
        for (int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }

        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i=0; i<arr.length; i++)
        {
            twice_count = twice_count + map.get(sum-arr[i]);

            // if (arr[i], arr[i]) pair satisfies the condition,
            // then we need to ensure that the count is
            // decreased by one such that the (arr[i], arr[i])
            // pair is not considered
            if (sum-arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count/2;
    }
}
