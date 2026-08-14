class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int l=0,max=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            int freq=hm.getOrDefault(ch,0);
            
            if(freq>2){
                while(hm.get(ch)>2){
                    char ch1=s.charAt(l);
                    hm.put(ch1,hm.get(ch1)-1);
                    //freq--;
                    l++;
                }
            }else{
               max=Math.max(max,i-l+1);
            }
            
        }
        return max;
    }
}