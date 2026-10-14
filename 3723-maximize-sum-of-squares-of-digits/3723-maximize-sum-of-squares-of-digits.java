class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int[] d={num,sum};
        if(sum>9*num) return "";
        StringBuilder res= new StringBuilder();
        for(int i=0;i<num;i++){
            int digi= Math.min(9,sum);
            res.append(digi);
            sum-=digi;
        }
        return res.toString();
    }
}