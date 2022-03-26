class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i  = 0;
        int j = nums.length - 1;
        
        int k = j;
        
        int[] res = new int[nums.length];
        
        while(i <= j){
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];
            
            if(a < b){
                res[k--] = b;
                j--;
            }else{
                res[k--] = a;
                i++;
            }
        }
        
        return res;
        
    }
}