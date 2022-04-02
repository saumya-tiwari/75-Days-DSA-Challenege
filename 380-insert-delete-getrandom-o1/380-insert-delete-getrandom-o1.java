class RandomizedSet {
    
    Map<Integer, Object> map;
    private static final Object PRESENT = new Object();
    Set<Integer> list = new HashSet<>();
    Random rand = new Random();
   
    public RandomizedSet() {
        map = new HashMap<>();   
    }
    
    public boolean insert(int val) {
        list.add(val);
        return map.put(val, PRESENT) == null;
        
    }
    
    public boolean remove(int val) {
        list.remove(val);
       return map.remove(val) == PRESENT;
    }
    
    public int getRandom() {
      return new ArrayList<Integer>(list).get(rand.nextInt(list.size()));
      
    }
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */