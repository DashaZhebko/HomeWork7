public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode element = head;
        while (element != null) {
            ListNode next = element.next;
            element.next = prev;
            prev = element;
            element = next;

        }
        return prev;
    }
}
