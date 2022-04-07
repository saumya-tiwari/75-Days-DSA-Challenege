class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int firstOccurence = findIndex(nums, target, true);
        int secondOccurence = findIndex(nums, target, false);
          
        return new int[]{firstOccurence, secondOccurence};
    }
    
    
    int findIndex(int[] nums, int target, boolean isFirst){
         int start = 0;
        int end = nums.length - 1;
        
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/ 2;
            
            if(target == nums[mid]){
                  res= mid;
               if(isFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            
            else if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
            
            return res;
    }
}