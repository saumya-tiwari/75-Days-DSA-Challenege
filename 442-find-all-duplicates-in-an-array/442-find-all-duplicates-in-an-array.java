class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        
        for(int num: nums)
            nums[Math.abs(num) - 1] *= -1;
        
      for(int num: nums){
            int x = Math.abs(num);
            if(nums[x - 1] > 0){
                res.add(x);
                nums[x - 1] *= -1;
            }
        }
        
        return res;
        
    }
}