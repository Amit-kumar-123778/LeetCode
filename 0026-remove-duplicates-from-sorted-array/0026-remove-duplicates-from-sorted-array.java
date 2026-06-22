class Solution {
    public int removeDuplicates(int[] nums) {
        //1st approach

        // if(nums.length== 0){
        //     return 0;
        // }
        // int k=1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=nums[k-1]){
        //         nums[k]=nums[i];
        //         k++;
        //     }
        // }
        // return k;

        // 2nd approach

        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                //i++;
                j++;
            }
            else{
               i++;
               nums[i]=nums[j];
               j++;
            }
        }
        return i+1;
    }
}