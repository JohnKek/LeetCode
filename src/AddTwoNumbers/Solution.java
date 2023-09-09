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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode r=res;
        int div = 0;
        int mod=0;
        int digit1 = l1.val;
        int digit2 = l2.val;
        while (l1 != null || l2 != null) {
            div = (digit1 + digit2+mod) % 10;
            mod = (digit1 + digit2+mod) / 10;
            r.next = new ListNode(div);
            r = r.next;
            if (l1==null||l1.next == null) {
                digit1 = 0;
                l1=null;
            } else {
                l1=l1.next;
                digit1 = l1.val;
            }
            if (l2==null||l2.next == null) {
                digit2 = 0;
                l2=null;
            } else {
                l2=l2.next;
                digit2 = l2.val;
            }
        }
        if(mod!=0){
            r.next = new ListNode(mod);
            r = r.next;
        }
        return res.next;
    }
}