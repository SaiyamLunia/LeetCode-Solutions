class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length < 3) return list;
        
        for(int i = 0; i < nums.length; i++) {
            if(i - 1 >= 0 && nums[i] == nums[i - 1]) 
                continue;
            int target = -nums[i], lo = i + 1, hi = nums.length - 1;
            while(lo < hi) {
                int sum = nums[lo] + nums[hi];
                if(sum == target) {
                    list.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    do{
                        hi = hi - 1;
                    } while(lo < hi && nums[hi] == nums[hi + 1]);
                    do {
						lo = lo + 1;
                    } while (lo < hi && nums[lo] == nums[lo - 1]);
                }
                else if(sum > target)
                    hi = hi - 1;
                else
                    lo = lo + 1;
            }
        }
        return list;
    }
}