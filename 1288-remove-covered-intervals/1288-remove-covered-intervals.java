class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int ans=1;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];});
        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][1]>prev[1]){
                ans++;
                prev=intervals[i];
            }
            
        }
         return ans;
    }
}