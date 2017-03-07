/*
*/
public class UniqueString {
    public boolean checkUnique(String s){
        for(int i = 0; i < s.length(); i++)
        {
            if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}
