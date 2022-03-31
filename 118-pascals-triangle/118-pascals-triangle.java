class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        
        ls1.add(1);
        res.add(ls1);
        
        
        for(int i = 1; i < numRows; i++){
             List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 1; j < i;j++)
               list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            list.add(1);
            
            res.add(list);
        }
        
        return res;
        
 
        
    }
}