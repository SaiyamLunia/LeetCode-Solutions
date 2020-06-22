class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length < 3) return nums[0];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i = i + 3) {
            int temp = nums[i];
            if((i + 1 < nums.length) && (temp == nums[i + 1] && temp == nums[i + 2]))
                continue;
            else 
                return temp;
        }
        return nums[0];
    }
}

