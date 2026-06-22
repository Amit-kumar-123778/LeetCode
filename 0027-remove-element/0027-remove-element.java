class Solution {
    public int removeElement(int[] nums, int val) {
       HashMap<Integer,Integer> hm= new HashMap<>();
       for(int n:nums){
          hm.put(n,0);
       }
       for(int i=0;i<nums.length;i++){
         if(nums[i]!=val){
            hm.put(nums[i], hm.get(nums[i])+1);
         }
       }
       Arrays.fill(nums,0);
       int j=0,sum=0;
       for(int n:hm.keySet()){
         int k=0;
         sum+=hm.get(n);
         while(k<hm.get(n)){
            nums[j++]=n;
            k++;
         }

       }
       return sum;
    }
}