class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int c1=0,c2=0;

    //     int[] a= new int[m+n];
    //     int i=0,j=0,k=0;
    //     while(i<m && j<n){
    //         if(nums1[i]<nums2[j]){
    //             a[k++]=nums1[i++];
    //         }
    //         else{
    //             a[k++]=nums2[j++];
    //         }
    //     }
    //     while(i<m){
           
    //         a[k++]=nums1[i++];
        
    //     }
    //     while(j<n){
         
    //         a[k++]=nums2[j++];
        
    //     }
    //     nums1=new int[m+n];
    //     int l=0;
    //     for(int h:a){
    //         nums1[l++]=h;
    //     }
    //    // System.out.println(Arrays.toString(a));

     int i=m-1,j=n-1,k=nums1.length-1;
     while(j>=0){
        if(i>=0 && nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
        }
        else{
            nums1[k--]=nums2[j--];
        }
     }

    }
}