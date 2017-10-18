/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = lengthOfList(headA);
        int lengthB = lengthOfList(headB);
        //equal out the lengths.
        if(lengthA >= lengthB){
            for(int i = 0; i < lengthA - lengthB; i++){
                headA = headA.next;
            }
        }
        if(lengthB > lengthA){
            for(int i = 0; i < lengthB - lengthA; i++){
                headB = headB.next;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    public int lengthOfList(ListNode list){
        int count = 0;
        while(list != null){
            list = list.next;
            count++;
        }
        return count;
    }
}
