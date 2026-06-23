class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int d=0,b=0,s=0;
        for(int i=0;i<gas.length;i++){
             b+=gas[i]-cost[i];
            if(b<0 ){
                s=i+1;
                d+=b;
                b=0;
            }
           
        }
        if(d+b>=0){
                return s;
        }
        return -1;
    }
}