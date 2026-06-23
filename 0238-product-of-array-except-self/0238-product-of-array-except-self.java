class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        //int[] ans= new int[n];
        //1st approach

        // ans[0]=1;
        // for(int i=1;i<n;i++){
        //     ans[i]=ans[i-1]*nums[i-1];
        // }
        // int r=1;
        // for(int i=n-1;i>=0;i--){
        //     ans[i]=ans[i]*r;
        //     r*=nums[i];
        // }
        // return ans;

        //2nd approach
        int mul=1;
        int cZero=0;
        for(int x:nums){
            if(x==0){
                cZero++;
            }
            else{
                mul*=x;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(cZero>1){
                nums[i]=0;
            }
            else if(cZero==1){
                if(nums[i]==0){
                    nums[i]=mul;
                }
                else nums[i]=0;
            }
            else{
                nums[i]=mul/nums[i];
            }
        }
        return nums;
    }
}