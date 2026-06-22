class Solution {
    public int maxNumberOfBalloons(String text) {
        String s="balloon";
        int[] freq= new int[26];
        for(char ch:text.toCharArray()) freq[ch-'a']++;
        int ans=Integer.MAX_VALUE;
        for(char ch:s.toCharArray()){
            ans=Math.min(ans,freq[ch-'a']);
        }
        if(freq['l'-'a']<2 || freq['o'-'a']<2) return 0;
        int a=freq['l'-'a'];
        int b=freq['o'-'a'];
        // if(a!=2*ans) return ans-a/ans;
        // if(b!=2*ans) return ans-b/ans;
        while(2*ans>a || 2*ans>b) ans--;
        return ans;
    }
}