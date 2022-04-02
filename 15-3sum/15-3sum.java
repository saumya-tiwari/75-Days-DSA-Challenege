class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        Set<List<Integer>> res = new HashSet<>();
        
        for(int i = 0; i < nums.length && nums[i] <= 0; i++){
           twoSum(i, res, nums); 
        }
            
          return new ArrayList(res);
        
    }
    
    void twoSum(int i, Set<List<Integer>> res, int[] nums){
        int lo = i+ 1;
        int hi = nums.length - 1;
        
        
        while(lo < hi){
            
            int sum = nums[i] + nums[lo] + nums[hi];
            
            if(sum < 0)
                lo++;
            else if(sum > 0)
                hi--;
            else{
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while(lo < hi && nums[lo] == nums[lo - 1])
                lo++;
            }
            
        }
    }
    
  
}