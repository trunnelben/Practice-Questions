package exercises1;

import java.util.*;

public class ctciPractice {
	public static boolean palindrome(ListNode a){
		int lengthA = lengthOfList(a);
		Stack<Integer> stackie = new Stack<>();
		for(int i = 0; i < lengthA/2; i++){
			stackie.push(a.val);
			a = a.next;
		}
		if(lengthA % 2 != 0) a = a.next; //this means it is odd length and the middle number can
		//be whatever and will still hold for the palindrome
		for(int i = 0; i < lengthA/2; i++){
			
			if(a.val != stackie.pop()) return false;
			a = a.next;
		}
		return true;
	}
	
	public static int lengthOfList(ListNode a){
		int count = 0;
		while(a != null){
			a = a.next;
			count++;
		}
		return count;
	}
	
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
		a.next = new ListNode(4);
		a = a.next;
		a.next = new ListNode(3);
		a = a.next;
		a.next = new ListNode(2);
		a = a.next;
		a.next = new ListNode(1);
		System.out.println(palindrome(b));
	}
}
