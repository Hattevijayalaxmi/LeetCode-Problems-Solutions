// Remove Duplicates from Sorted List 2 - LeetCode 82

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode temp = head;

        while(temp != null && temp.next != null) {

            if(temp.val == temp.next.val) {

                while(temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }

                prev.next = temp.next;

            } else {
                prev = temp;
            }

            temp = temp.next;
        }

        return dummy.next;
    }
}
