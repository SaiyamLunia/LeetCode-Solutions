/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        if(temp == null || temp.next == null) return temp;
        
        int var = temp.val;
        temp.val = temp.next.val;
        temp.next.val = var;
        temp = temp.next;
        
        swapPairs(temp.next);
        return head;
    }
    
}