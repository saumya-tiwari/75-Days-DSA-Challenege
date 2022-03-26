class Solution {
    public int maxProfit(int[] prices) {
        
        int sell = 0;
        int buy =  Integer.MAX_VALUE;
        
        
        for(int n: prices){
            buy = Math.min(buy, n);
            sell = Math.max(sell, n - buy);
        }
        
        return sell;
        
    }
}