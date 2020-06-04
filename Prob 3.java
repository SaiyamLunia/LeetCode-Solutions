class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, start = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c))
                if(map.get(c) >= start)
                    start = map.get(c) + 1;
            res = Math.max(res, i - start + 1);
            map.put(c, i);
        }
        return res;
    }
}