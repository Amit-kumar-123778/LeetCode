class Solution {
    public void rotate(int[] nums, int k) {
    //    for(int i=0;i<k;i++){
    //       int n=nums[nums.length-1];
    //       for(int j=nums.length-1;j>=1;j--){
    //         nums[j]=nums[j-1];
    //       }
    //       nums[0]=n;
    //    }
         k= k % nums.length;
        int i,j,n=nums.length;
        int temp[] = new int[k];
        for(i=0;i<k;i++)
            temp[i] = nums[i+n-k];
        for(i=n-k-1;i>=0;i--)
            nums[i+k] = nums[i];
        for(i=0;i<k;i++)
            nums[i]=temp[i];

    }
    // public static void reverse(int [] a, int l, int r){
    //     while(l<r){
    //         int t=a[l];
    //         a[l]=a[r];
    //         a[r]=t;
    //         l++;
    //         r--;
    //     }
    // }
}