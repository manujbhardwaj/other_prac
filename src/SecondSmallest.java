/*
*/
public class SecondSmallest {
    public int secondSmallest(int[] arr){
        if(arr.length < 2)
            return 0;
        int smallest = 0;
        int second_smallest = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == smallest)
            {
                second_smallest = smallest;
            }
            else if(arr[i] < smallest)
            {
                second_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < second_smallest)
            {
                second_smallest = arr[i];
            }
        }
        return second_smallest;
    }
}
