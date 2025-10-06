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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode res = result;

        while(l1 != null || l2 != null) {
            int num1 = (l1 == null) ? 0: l1.val;
            int num2 = (l2 == null) ? 0: l2.val;
            int sum = num1 + num2 + carry;
            int rem = sum % 10;
            carry = sum / 10;
            result.next = new ListNode(rem);
            result = result.next;
            l1 = (l1 == null) ? null: l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        if(carry != 0) {
            result.next = new ListNode(carry);
        }
        return res.next;
    }
}
