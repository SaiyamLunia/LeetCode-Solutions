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

// rather than passing a parameter n (number of nodes), we now pass down two parameters lo and hi indicating the range of values of a tree.

// For example, generateTrees(1, 5) generate trees whose values range from 1 to 5, and each of them has a chance to be the root, which also includes the information of number of nodes n. Say when the root is 3, we calculate generateTrees(1, 2) and generateTrees(4, 5).

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generateTrees(1, n);
    }
    
    private List<TreeNode> generateTrees(int lo, int hi) {
        int n = hi - lo + 1;
        if (n == 0) {
            List<TreeNode> L = new ArrayList<>();
            L.add(null);
            return L;
        }
        List<TreeNode> result = new ArrayList<>();
        for (int i = lo; i <= hi; ++i) {
            List<TreeNode> leftSubtrees = generateTrees(lo, i - 1);
            List<TreeNode> rightSubtrees = generateTrees(i + 1, hi);
            for (TreeNode leftSub : leftSubtrees) {
                for (TreeNode rightSub : rightSubtrees) {
                    TreeNode newTree = new TreeNode(i);
                    newTree.left = leftSub;
                    newTree.right = rightSub;
                    result.add(newTree);
                }
            }
        }
        return result;
    }
}