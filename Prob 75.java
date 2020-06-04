class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length, max = 0;
        int arr[] = new int[] { 0, 0, 0 };
        for (int i = 0; i < length; i++) {
            arr[nums[i]]++;
            max = Math.max(max, nums[i]);
        }
        int k = 0, l = 0;
        while(k <= max) {
            for (int i = 0 ; i < arr[k]; i++) {
                nums[l] = k;
                l++;
            }
            k++;
        }
    }
}