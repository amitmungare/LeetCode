package linkedList;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        
        while(head != null){
            
            ListNode secNode = head.next;
            head.next = prev;
            prev= head;
            head = secNode;
        }
        return prev;
    }
}
