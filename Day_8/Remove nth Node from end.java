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
        if(head == null) {
            return null;
        }
        if(head.next == null && n == 1) {
            return null;
        }
        
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }   
        int front = size+1 - n;
        ListNode temp1 = head;
        ListNode prev = null;
        if(front == 1) {
            return head.next;
        }
        while(front != 1){
            prev = temp1;
            temp1 = temp1.next;
            front--;
        }
        // System.out.println(prev.val);
        // System.out.println(temp1.val);
        prev.next = temp1.next;
        return head;



    }
}