/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        ListNode fin = new ListNode(0);
        ListNode ret = fin;
        while(head != null){
            if(set.contains(head.val)){
            }
            else{
                set.add(head.val);
                fin.next = new ListNode(head.val);
                fin = fin.next;
            }
            head = head.next;
        }
        return ret.next;
    }
}
