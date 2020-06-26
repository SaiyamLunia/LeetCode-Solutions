/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int num = 0;
    public int sumNumbers(TreeNode root) {
        findNumber(root, num);
        return num;
    }
    
    public int findNumber(TreeNode root, int num) {
        if(root == null) return 0;
        num = (num * 10) + root.val;
        findNumber(root.left, num);
        findNumber(root.right, num);
        if(root.left == null && root.right == null)
            this.num += num;
        return num;
    }
}