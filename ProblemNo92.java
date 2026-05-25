// Reverse Linked List 2 - LeetCode 92

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode n = new ListNode(0);
        n.next = head;

        ListNode prev = n;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {

            ListNode next = curr.next;

            curr.next = next.next;

            next.next = prev.next;

            prev.next = next;
        }

        return n.next;
    }
}
