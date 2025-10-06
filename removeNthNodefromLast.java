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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        // ListNode prev = null;
        ListNode first = head;
        int length = 0;
        while(curr != null) {
            curr = curr.next;
            length++;
        }

        int k = length - n;
        int count = 0;
        ListNode current = head;
        ListNode prev = null;
        System.out.println(k);
        if(k==0) {
            return head.next;
        }
        while(current != null) {
            if(count == k) {
                prev.next = current.next;
                break;
            } 
            count++;
            prev = current;
            current = current.next;
        }
        return first;
    }
}
