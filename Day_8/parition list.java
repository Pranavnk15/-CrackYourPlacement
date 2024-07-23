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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode traverse1 = head;
        ListNode traverse2 = head;
        ListNode temp = new ListNode();
        ListNode ans = temp;

        while(traverse1 !=null) {
            if(traverse1.val < x) {
                temp.next = new ListNode(traverse1.val);
                temp = temp.next;
                traverse1 = traverse1.next;
            } else {
                traverse1 = traverse1.next;
            }
        }
          while(traverse2 != null) {
            if(traverse2.val >= x) {
                temp.next = new ListNode(traverse2.val);
                temp = temp.next;
                traverse2 = traverse2.next;
            } else {
                traverse2 = traverse2.next;
            }
        }
        temp.next = null;
        return ans.next;





        // ListNode traverse1 = head;
        // ListNode traverse2 = head;
        // ListNode temp = new ListNode();
        // ListNode ans = temp;

        // while(traverse1 != null) {
        //     if(traverse1.val < x) {
        //         temp.next = new ListNode(traverse1.val);
        //         temp = temp.next;
        //         traverse1 = traverse1.next;
        //     }
        //       else {
        //         traverse1 = traverse1.next;
        //     }
        // }

        // while(traverse2 != null) {
        //     if(traverse2.val >= x) {
        //         temp.next = new ListNode(traverse2.val);
        //         temp = temp.next;
        //         traverse2 = traverse2.next;
        //     } else {
        //         traverse2 = traverse2.next;
        //     }
        // }
        // temp.next = null;
        // return ans.next;
    }
}