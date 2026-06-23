class Solution {
    public int strStr(String haystack, String needle) {
        int m= haystack.length();
        int n= needle.length();
        for(int i=0;i<m;i++){
            int c=0;
            int k=i;
            for(int j=0;j<n;j++){
                if(k<m){
                  if(haystack.charAt(k)==needle.charAt(j)){
                    c++;
                    k++;
                  }
                }
            }
            if(c==n){
                return i;
            }
        }
        return -1;

    }
}