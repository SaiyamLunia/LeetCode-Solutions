class Solution {
    public int firstMissingPositive(int[] nums) {
        int index = 1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0)
                continue;
            if((nums[i] == index) && (i != nums.length - 1) && (nums[i] == nums[i+1]))
                continue;
            else if(nums[i] == index)
                index++;
            else break;
        }
        return index;
    }
}