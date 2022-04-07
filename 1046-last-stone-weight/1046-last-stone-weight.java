class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int n: stones){
            heap.add(n);
        }
        
        while(heap.size() > 1){
            int stone1 = heap.remove();
            int stone2 = heap.remove();
            
            if(stone1 != stone2)
                heap.add(stone1 - stone2);
        }
        
        
        return !heap.isEmpty() ? heap.remove() : 0;
        
    }
}