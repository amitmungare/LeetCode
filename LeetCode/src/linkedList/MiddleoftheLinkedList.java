package linkedList;

public class MiddleoftheLinkedList {
	 public ListNode middleNode(ListNode head) {
	        
	        if(head ==null){
	            return null;
	        }        
	        ListNode temp =head;
	        
	        while(head != null && head.next !=null){
	            head = head.next.next;
	            temp = temp.next;
	        }
	        return temp;
	    
	        
	    }
}
