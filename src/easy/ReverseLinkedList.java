package easy;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head!=null&&head.next!=null){
            ListNode newhead= reverseList(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;
        }else{
            return head;
        }
        
        
    }

}
