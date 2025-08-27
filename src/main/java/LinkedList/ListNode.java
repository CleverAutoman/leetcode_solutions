package LinkedList;

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public String toString() {
         ListNode p = this;
         StringBuilder sb = new StringBuilder();
         while (p != null) {
             sb.append(p.val).append(" -> ");
             p = p.next;
         }
         return sb.delete(sb.length() - 4, sb.length()).toString();
     }
 }