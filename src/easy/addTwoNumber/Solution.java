package easy.addTwoNumber;

public class Solution {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pointer1=l1;
        ListNode pointer2=l2;
        ListNode resultNode=new ListNode(0);
        ListNode pointer3=resultNode;
        int carry=0;
        
        while(pointer1!=null||pointer2!=null||carry!=0){
        	int sum=(pointer1==null?0:pointer1.val)+(pointer2==null?0:pointer2.val)+carry;
        	pointer3.next=new ListNode(sum%10);
            carry=sum/10;   	
            pointer1=pointer1==null?pointer1:pointer1.next;
            pointer2=pointer2==null?pointer2:pointer2.next;
            pointer3=pointer3==null?pointer3:pointer3.next;
        }
        return resultNode.next;
    }
	
	public static void main(String args[]){
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		ListNode result=addTwoNumbers(l1,l2);
		while(result!=null){
			System.out.print(result.val+"->");
			result=result.next;
		}
	}

}
