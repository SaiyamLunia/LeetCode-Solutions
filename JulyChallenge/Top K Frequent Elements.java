class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length)
            return nums;
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List< Integer> keyList = new ArrayList(map.keySet());
        Collections.sort(keyList, (a, b)-> map.get(b).compareTo(map.get(a)));
        for(int i = 0; i < k; i++)
            res[i] = keyList.get(i);
        return res;
    }
}