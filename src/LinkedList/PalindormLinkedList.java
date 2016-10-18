package LinkedList;

import java.util.LinkedList;

import easy.ListNode;

public class PalindormLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode p1=head;
        ListNode n=p1.next;
        ListNode pr=null;
        ListNode p2=head;
        while(p2.next!=null&&p2.next.next!=null){
            p2=p2.next.next;
            pr=p1;
            p1=n;
            n=n.next;
            p1.next=pr;
        }
          //odd number of elements, need left move p1 one step
          if(p2.next == null) {
              p1 = p1.next;
          }
        
      while(n!= null) {
          if(p1.val != n.val) {
              return false;
          }
          p1 = p1.next;
          n = n.next;
      }
      return true;
      }
    
    public static void main(String args[]){
    	ListNode l=new ListNode(1);
    	l.next=new ListNode(0);
    	l.next.next=new ListNode(0);
    	System.out.println(isPalindrome(l));
    }
}
