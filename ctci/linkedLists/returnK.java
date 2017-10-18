package exercises1;

import java.util.*;

public class ctciPractice {
	public static int returnK(ListNode a, int k){
		//linkedlist<int> vs <integer>
		for(int i = 1; i < k; i++){
			if(a == null) return (Integer) null;//throw error "k is outside of the list";
			a = a.next;
		}
		return a.val;
	}
	
	//mmake own linked list /node
	public static class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public static void main (String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = a;
		a.next = new ListNode(2);
		a = a.next;
		a.next = new ListNode(3);
		a = a.next;
		a.next = new ListNode(4);
		a = a.next;
		a.next = new ListNode(5);
		a = a.next;
		a.next = new ListNode(6);
		a = a.next;
		a.next = new ListNode(7);
		a = a.next;
		a.next = new ListNode(8);
		System.out.println(returnK(b, 6));
	}
}
