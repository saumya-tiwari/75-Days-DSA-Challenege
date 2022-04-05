class Solution {
    public void sortColors(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        int curr = 0;
        
        
        int tmp;
        
        
        while(curr <= end){
            
            if(nums[curr] == 0){
                tmp = nums[start];
                nums[start++] = nums[curr];
                nums[curr++] = tmp;

              
            }else if(nums[curr] == 2){
                tmp = nums[curr];
                nums[curr] = nums[end];
                nums[end--] = tmp;    
      
            }
            else{
               curr++;
            }
                      
        }       
        
    }
}