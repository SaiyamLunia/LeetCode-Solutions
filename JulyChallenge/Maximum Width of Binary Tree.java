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
     public class Node {
        TreeNode node;
        int pos;
        Node(TreeNode node, int pos) {
            this.node = node;
            this.pos = pos;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        Node curr = new Node(root, 1);
        Queue<Node> queue = new LinkedList<>();
        queue.add(curr);
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
            int size = queue.size();
            int left = -1;
            for(int i = 0; i < size; i++) {
                Node n = queue.poll();
                if(i == 0) left = n.pos; //first polled node from queue is the left side of the tree in same level

                if(n.node.left != null) queue.offer(new Node(n.node.left, n.pos * 2));
                if(n.node.right != null) queue.offer(new Node(n.node.right, n.pos * 2 + 1));
                max = Math.max(max, n.pos - left + 1);
            }
        }
        return max;
    }
}