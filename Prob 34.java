class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};
        int leftIndex = binarySearch(nums, 0, nums.length - 1, target);
        if(leftIndex == -1 || leftIndex == nums.length)
            return targetRange;
        int lo = leftIndex;
        int hi = leftIndex;
        
        while (lo >= 0 && nums[lo] == target)
            lo--;
        targetRange[0] = lo + 1;
        while(hi < nums.length && nums[hi] == target)
            hi++;
        targetRange[1] = hi - 1;
        
        return targetRange;
    }
    
    private int binarySearch(int nums[], int l, int r, int target) {
         while (l <= r) { 
            int m = l + (r - l) / 2; 
            if (nums[m] == target) 
                return m;
            if (nums[m] > target ) 
                r = m - 1; 
            else
                l = m + 1; 
        } 
        return -1; 
    }
        
}