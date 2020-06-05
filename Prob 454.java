class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i : A) {
            for(int j : B) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for(int k : C) {
            for(int l : D) {
                int sum = k + l;
                if(map.containsKey(-sum))
                    count += map.get(-sum);
            }
        }
        return count;
    }
}