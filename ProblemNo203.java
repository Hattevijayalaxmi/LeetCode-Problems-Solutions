// Remove Linked List Element - LeetCode 203

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode n = new ListNode(0);
        n.next = head;

        ListNode current = n;

        while(current.next != null) {

            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return n.next;
    }
}
