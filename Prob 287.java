class Solution {
    public int findDuplicate(int[] nums) {
        int x = nums[0];
        int y = nums[nums[0]];
        
        while(x != y) {
            x = nums[x];
            y = nums[nums[y]];
        }
        x = 0;
        while(x != y) {
            x = nums[x];
            y = nums[y];
        }
        return x;
    }
}