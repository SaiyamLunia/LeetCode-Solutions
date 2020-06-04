class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3) return new ArrayList<List<Integer>>();
        Set<List<Integer>> list = new HashSet<List<Integer>>();
        for (int in = 0; in < nums.length; in++){
            int rem = -nums[in];
            
            Map<Integer, Integer> map = new HashMap<>();
            for(int i =in+1; i < nums.length; i++){
                int complement = rem - nums[i];
                if(map.containsKey(complement)){
                        list.add(new ArrayList<>(Arrays.asList(nums[in], complement, nums[i])));
                }
                map.put(nums[i], i);
            }
        }
        return new ArrayList(list);
    }
}