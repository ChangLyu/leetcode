package LinkedList;

import easy.ListNode;

public class SwapNodesInParis {
	   public ListNode swapPairs(ListNode head) {
	        if (head==null||head.next==null) return head;
	        ListNode p1=head.next;
	        ListNode p2=head.next.next;
	        p1.next=head;
	        head.next=p2;
	        head=p1;
	        head.next.next=swapPairs(p2);
	        return head;
	    }
}
