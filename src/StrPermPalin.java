
import java.util.HashMap;

/*
 To check if permutation of a string can be a palindrome.
*/























public class StrPermPalin {
    private boolean canMakePalindrom(String s) {
        HashMap<Character, Integer> countChars = new HashMap<>();

        // Count the occurrences of each character
        for (char c : s.toCharArray()) 
        {
            Integer count = countChars.get(c);
            if (count == null) 
            {
                count = 1;
            } 
            else 
            {
                count = count + 1;
            }
            countChars.put(c, count);
        }

        boolean hasOdd = false;
        for (int count : countChars.values()) 
        {
            if (count % 2 == 1) 
            {
                if (hasOdd) 
                {
                    // Found two chars with odd counts - return false;
                    return false;
                } 
                else 
                {
                    // Found the first char with odd count
                    hasOdd = true;
                }
            }
         }

         // Haven't found more than one char with an odd count
         return true;
    }
}
