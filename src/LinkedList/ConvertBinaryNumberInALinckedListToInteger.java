package LinkedList;

import easy.ListNode;

public class ConvertBinaryNumberInALinckedListToInteger {
	public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size ++;
            temp= temp.next;
        }
        
        int sums=0;
        for(int point= size-1; point>=0; point --){
          sums+= head.val * Math.pow(2, point);  
            head=head.next;
        }
        return sums;
        
    }
}
