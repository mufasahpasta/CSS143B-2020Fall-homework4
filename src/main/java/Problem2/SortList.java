package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // Runs in 1 pass
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;
        ListNode prev_slow_ptr = null;
        if (head != null) {
            if (head.next == null) return null;

            while (fast_ptr != null && fast_ptr.next != null) {
                prev_slow_ptr = slow_ptr;
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            if (prev_slow_ptr != null) prev_slow_ptr.next = null;
            return slow_ptr;
        }

        return null;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeLists(list1, list2.next);
            return list2;
        }
    }
}
