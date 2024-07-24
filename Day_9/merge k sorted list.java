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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode node: lists) {
            while(node != null) {
                arr.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(arr);
        ListNode newNode = new ListNode(-1);
        ListNode temp = newNode;
        for(int i = 0; i<arr.size(); i++) {
            ListNode node = new ListNode(arr.get(i));
            temp.next = node;
            temp = temp.next;
        }
        return newNode.next;

    }
}