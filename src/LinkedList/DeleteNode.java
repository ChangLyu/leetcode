package LinkedList;

import easy.ListNode;

public class DeleteNode {
//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
    public void deleteNode(ListNode node) {
        if (node!=null&&node.next!=null){

            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}
