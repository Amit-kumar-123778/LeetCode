class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for(int i=0;i<s.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()) return s.substring(0,i);
                if(s.charAt(i)!=strs[j].charAt(i)) return s.substring(0,i);
            }
        }
        return s;
    }
}