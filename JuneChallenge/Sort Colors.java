class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length, max = 0;
        // int arr[] = new int[] { 0, 0, 0 };
        int count_zero = 0, count_one = 0, count_two = 0;
        for (int i = 0; i < length; i++) {
            if(nums[i] == 0)
                count_zero++;
            if(nums[i] == 1)
                count_one++;
            if(nums[i] == 2)
                count_two++;
        }
        int i = 0;
        while(i < nums.length) {
            while(count_zero != 0) {
                nums[i] = 0;
                count_zero--;
                i++;
            }
            while(count_one != 0) {
                nums[i] = 1;
                count_one--;
                i++;
            }
            while(count_two != 0) {
                nums[i] = 2;
                count_two--;
                i++;
            }
        }
    }
}