import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
     
        String s1="";
        StringTokenizer st= new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
           s1=st.nextToken();
        }
        return s1.length();

    }
}