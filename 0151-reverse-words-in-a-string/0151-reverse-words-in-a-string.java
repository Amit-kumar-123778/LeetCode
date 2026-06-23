class Solution {
    public String reverseWords(String s) {
        String[] st= s.trim().split("\\s+");
        int l=0,r=st.length-1;
        while(l<r){
            String t=st[l];
            st[l]=st[r];
            st[r]=t;
            l++;
            r--;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<st.length;i++){
            sb.append(st[i]);
            if(i!=st.length-1)
               sb.append(" ");
        }
        return sb.toString();
    }
}