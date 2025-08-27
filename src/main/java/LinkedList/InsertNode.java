package LinkedList;

public class InsertNode {

    /**
     *
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-5001, head);

        for (ListNode pt = dummy; pt != null && pt.next != null; ) {
            ListNode curr = pt.next;

            ListNode pt_ = dummy;
            while (pt_ != null && pt_.next != curr && pt_.next.val < curr.val) {
                pt_ = pt_.next;
            }
            if (pt_.next == curr) {
                pt = pt.next;
                continue;
            }
            // delete
            pt.next = curr.next;

            // insert
            curr.next = pt_.next;
            pt_.next = curr;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        System.out.println(new InsertNode().insertionSortList(l));
    }
}
