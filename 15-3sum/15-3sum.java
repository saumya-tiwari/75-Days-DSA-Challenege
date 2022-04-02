class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < nums.length && nums[i] <= 0; i++){
            if(i == 0 || nums[i - 1] != nums[i])
                twoSum(i, res, nums); 
        }
            
          return res;
        
    }
    
    void twoSum(int i, List<List<Integer>> res, int[] nums){
        int lo = i+ 1;
        int hi = nums.length - 1;
        
        
        while(lo < hi){
            
            int sum = nums[i] + nums[lo] + nums[hi];
            
            if(sum < 0)
                ++lo;
            else if(sum > 0)
                --hi;
            else{
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while(lo < hi && nums[lo] == nums[lo - 1])
                    ++lo;
            }
            
        }
    }
    
  
}