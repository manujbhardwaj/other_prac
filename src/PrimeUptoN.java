/*
Prime upto n
*/
public class PrimeUptoN {
    public void prime(int n){
        
        //int[] arr = new int[n];
        boolean found;
        for(int i = 2; i < n; i++)
        {
            found =  true;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i%j == 0)
                {
                    found = false;
                    break;
                }
            }
            if(found)
                System.out.println(i);
        }
    }
}
/*
boolean found;
        for(int i = 2; i < n; i++)
        {
            found =  true;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i%j == 0)
                {
                    found = false;
                    break;
                }
            }
            if(found)
                System.out.println(i);
        }
*/