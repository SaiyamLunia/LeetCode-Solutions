/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        Node cur = head;
        while (cur.next != null || cur.child != null) {
            // 3 cases
            // case 1: next is NOT NULL, child is NULL => move the pointer (done at the end)
            // case 2: next is NULL, child is NOT NULL
            if (cur.next == null) {
                // fix pointers
                cur.next = cur.child;
                cur.next.prev = cur;
                cur.child = null;
            }
            // case 3: both are not null
            else if (cur.next != null && cur.child != null){
                Node curNext = cur.next;
                // swap pointers between child and next
                cur.next = cur.child;
                cur.next.prev = cur;
                cur.child = null;

                // move to the end of the list
                Node tmp = cur.next;
                while (tmp.next != null)
                    tmp = tmp.next;

                // append the "old" cur at the end
                tmp.next = curNext;
                curNext.prev = tmp;
            }

            cur = cur.next;
        }
        return head;
    }
}