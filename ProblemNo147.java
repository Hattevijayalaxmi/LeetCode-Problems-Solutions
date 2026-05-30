// Insertion Sort List - LeetCode 147


class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode n = new ListNode(0);

        while (head != null) {
            ListNode curr = head;
            head = head.next;

            ListNode prev = n;

            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
        }

        return n.next;
    }
}
