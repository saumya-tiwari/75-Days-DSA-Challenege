class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        
        
        for(int n: nums2){
            heap.add(n);
        }
        
        int ans = 0;
        
        
        for(int n: nums1){
            ans += n * heap.poll();
        }
        
        return ans;
    }
}