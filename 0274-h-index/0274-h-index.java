class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>=n)
                a[n]++;
            else
                a[citations[i]]++;
        }
         int c=0;
         for(int i=n;i>=0;i--){
            c+=a[i];
            if(c>=i)
               return i;
         }
         return c;

    }
}