/*
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array.
Return 0 if there is no such subarray.

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
Example 4:

Input: nums = [1,1,0,0,1,1,1,0,1]
Output: 4
Example 5:

Input: nums = [0,0,0]
Output: 0
*/

class Solution {
    public int longestSubarray(int[] nums) {
        int index = 0, count = 0;
        int left = 0, right = 0;
        int flips = 1;
        
        while (right < nums.length) {
            if (nums[right] == 1) {
                right++;
            } else if (flips > 0) {
                right++;
                flips--;
            } else if (left < right) { 
                flips += 1 - nums[left];
                left++;
            } else { // A.get(right) == 0 && flips == 0 && left == right
                left++; 
				right++;
            }
            
            if (right - left > count) {
                index = left;
                count = right - left;
            }
        }
        return count - 1;
    }
}