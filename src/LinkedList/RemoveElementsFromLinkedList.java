package LinkedList;

import easy.ListNode;

public class RemoveElementsFromLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode p=new ListNode(0);
        p.next=head;
        ListNode pointer=p;
        while(pointer!=null&&pointer.next!=null){
            if(pointer.next.val==val){
                pointer.next=pointer.next.next;
            }else{
                pointer=pointer.next;
            }
        }
        return p.next;
    }
    
    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}
}
