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
    public int getDecimalValue(ListNode head) {
        List<Integer> num = new ArrayList<>();
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp = prev;
        while(temp != null) {
            num.add(temp.val);
            temp = temp.next;
        }

        int ans = 0;
        for(int i = 0; i<num.size(); i++){
            ans += num.get(i)*Math.pow(2, i);
        }
        return ans;


        // List<Integer> num = new ArrayList<>(); // to store the elements in the linkedlist
        
        // //reversring the linked list as the MSB is at the head & we perform operation from LSB to get the decimal number
        // ListNode prev = null;
        // ListNode curr = head;
        // ListNode next = null;

        // while(curr != null) {
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        
        // //After reversing we will traverse in reverse so that we can travel from LSB store it and perform operations

        // ListNode temp = prev;
        // while(temp != null) {
        //     num.add(temp.val);
        //     temp = temp.next;
        // }
        // // System.out.println(num.size());
        // int ans = 0;
        // for(int i = 0; i<num.size(); i++) {
        //     int ele = num.get(i);
        //     ans += ele * Math.pow(2, i);// converting to decimeal and adding all the ans
        //     System.out.println(ans);
        // }
        // return ans;
    }
}