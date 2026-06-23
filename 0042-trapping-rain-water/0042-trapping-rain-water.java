class Solution {
    public int trap(int[] height) {
        int area=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int mid=st.pop();
                if(st.isEmpty()) break;
                int l=st.peek();
                int width=i-l-1;
                int hight=Math.min(height[l],height[i])-height[mid];
                area+=width*hight;
            }
            st.push(i);
        }
        return area;
    }

}