class Solution {
    public boolean canJump(int[] nums) {
    //    int  r=0;
    //    for(int i=0;i<nums.length;i++){
    //     if(i>r) return false;
    //     r=Math.max(r,i+nums[i]);
    //     if(r>=nums.length-1) return true;
    //    }
    //    return true;
         return jump(nums,0,0);
    }
    public boolean jump(int a[],int r, int i){
        if(i>r) return false;
        r=Math.max(r,i+a[i]);
        if(r>= a.length-1) return true;
        return jump(a,r,i+1);
        
    }
}