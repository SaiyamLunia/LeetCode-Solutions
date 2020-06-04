class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        // if(length == 0)
        //     return false;
        int max = 0;
        for(int i = 0; i <= max; i++) {
            max = Math.max(max, i + nums[i]);
            if(max >= length - 1) return true;
        }
        return false;
    }
}