/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode finish = head;
        while(l1 != null || l2 != null){
            if(l1 == null || (l2 != null && l2.val < l1.val)){
                finish.next = l2;
                l2 = l2.next;
            } 
            else{
                finish.next = l1;
                l1 = l1.next;
            } 
            finish = finish.next;
        }
        return head.next;
    }
}
