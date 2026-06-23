class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int n = s.length();
        int cycleLen = 2 * numRows - 2;
        String result = "";
        for(int row = 0; row < numRows; row++){
            int i = row;
            boolean toggle = false;
            while(i < n){
                result += s.charAt(i);
                i += (row == 0 || row == numRows - 1)? cycleLen : toggle? 2 * row : cycleLen - 2 * row;
                toggle = !toggle;
            }
        }
        return result;
    }
}