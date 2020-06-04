class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int initial = nums[0], index = 1;
        for(int i = 1; i < nums.length; i++){
            if(initial != nums[i]) {
                initial = nums[i];
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}