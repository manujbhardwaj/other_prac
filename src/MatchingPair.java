
import java.util.Stack;

/*
Set of rules
i. Upper case letter is followed by any Upper case letter
ii. Upper case letter is followed by its same Lower case letter and dissolve the pair.
iii. if two lower case letters are present without a match stop and return 
Example: ABba will return 3 as A match with B, B matches with b and gets dissolved and then A matches with a and gets dissolved 
*/
public class MatchingPair {
    public int matchingPair(String input)
    {
        int n = input.length();
        int ans = -1;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            char c = input.charAt(i);
            if(Character.isUpperCase(c))
            {
                stack.push(input.charAt(i));
            }
            else if(Character.isLowerCase(c))
            {
                if(stack.empty() || stack.pop() != Character.toUpperCase(c))
                {
                    break;
                }
                else
                {
                    ans = i;
                }
            }
        }
        return ans;
    }
}
