package LinkedList;

import easy.ListNode;

public class IntersectionOfTwoLinkedList {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    //boundary check
		//Clever, the two iterations will both run for listA.length + listB.length 
		//and will reach the intersection point at the same time after switching the pointer.
		//if a and b have no insection a will be null and b will be null too, which stops loop.
	    if(headA == null || headB == null) return null;
	    
	    ListNode a = headA;
	    ListNode b = headB;
	    
	    //if a & b have different len, then we will stop the loop after second iteration
	    while( a != b){
	    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
	        a = a == null? headB : a.next;
	        b = b == null? headA : b.next;    
	    }
	    
	    return a;
	}
}
