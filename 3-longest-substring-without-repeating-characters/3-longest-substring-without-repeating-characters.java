class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      int ans = 0;
        
      Map<Character, Integer> map = new HashMap<>();
        
      for(int i = 0, j = 0; j < s.length(); j++){
          
          if(map.containsKey(s.charAt(j))){
              i = Math.max(map.get(s.charAt(j)), i);
          }
        
          ans = Math.max(ans, j - i + 1);
          map.put(s.charAt(j), j + 1);
      }
        
        return ans;
         
        
    }
}