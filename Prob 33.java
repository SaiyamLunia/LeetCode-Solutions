class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    private int binarySearch(int[] nums, int target, int low, int high) {
        if(high < low || (low == high && nums[low] != target)) return -1;
        int mid = low + (high - low) / 2;
        
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target && nums[mid] > nums[high] && nums[high] >= target)
            return binarySearch(nums, target, mid + 1, high);
        else if(nums[mid] < target && nums[high] >= target)
            return binarySearch(nums, target, mid + 1, high);
        else if(nums[mid] < target && nums[high] < target && nums[mid] > nums[high])
            return binarySearch(nums, target, mid + 1, high);
        else return binarySearch(nums, target, low, mid - 1);
        
    }
}