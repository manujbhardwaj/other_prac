/*
Given a string ‘str’ of digits and an integer ‘n’, build the lowest possible number by removing ‘n’ digits from the string and not changing the order of input digits.

Examples:

Input: str = "4325043", n = 3
Output: "2043"

Input: str = "765028321", n = 5
Output: "0221"

Input: str = "121198", n = 2
Output: "1118" 
*/











public class RemoveDigtoBuildLow {
    /*
    Initialize result as empty string
     res = ""
    buildLowestNumber(str, n, ans)
    1) If n == 0, then there is nothing to remove.
       Append the whole 'str' to 'res' and return

    2) Let 'len' be length of 'str'. If 'len' is smaller or equal 
       to n, then everything can be removed
       Append nothing to 'res' and return

    3) Find the smallest character among first (n+1) characters
       of 'str'.  Let the index of smallest character be minIndex.
       Append 'str[minIndex]' to 'res' and recur for substring after
       minIndex and for n = n-minIndex

    buildLowestNumber(str[minIndex+1..len-1], n-minIndex).
    */
    public void buildLowestNumberRec(String str, int n, StringBuilder ans)
    {
        // If there are 0 characters to remove from str,
        // append everything to result
        if (n == 0)
        {
            ans.append(str);
            return;
        }

        int len = str.length();

        // If there are more characters to remove than string
        // length, then append nothing to result
        if (len <= n)
            return;

        // Find the smallest character among first (n+1) characters
        // of str.
        int minIndex = 0;
        for (int i = 1; i<=n ; i++)
            if (str.charAt(i) < str.charAt(minIndex))
                minIndex = i;

        // Append the smallest character to result
        ans.append(str.charAt(minIndex));

        // substring starting from minIndex+1 .
        String new_str = str.substring(minIndex+1);

        // Recur for the above substring and n equals to n-minIndex
        buildLowestNumberRec(new_str, n-minIndex, ans);
    }

    String buildLowestNumber(String str, int n)
    {
        StringBuilder ans = new StringBuilder();

        buildLowestNumberRec(str, n, ans);

        return ans.toString();
    }
}
