class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0], ans=0;
       for(int n: prices){
          min=Math.min(n,min);
          ans=Math.max(ans,n-min);
       }
       return ans;
    }
}