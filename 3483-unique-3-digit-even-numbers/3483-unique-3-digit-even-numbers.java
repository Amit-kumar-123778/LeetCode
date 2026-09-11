class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> h=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if((k==i) ||(k==j)) continue;
                    int a=100*digits[i]+10*digits[j]+digits[k];
                    if(a%2==0){
                        h.add(a);
                    }
                }
            }
        }
        return h.size();
    }
}