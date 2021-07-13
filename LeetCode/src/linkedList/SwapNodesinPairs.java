package linkedList;

public class SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
	       if(head==null || head.next==null)return head;
	         
	        ListNode prev = new ListNode(0);
	        prev.next = head;
	        ListNode temp = prev;
	        
	        while(prev.next != null && prev.next.next != null){
	            
	            ListNode a = prev.next;
	            ListNode b = a.next;
	            ListNode c = b.next;
	            
	            prev.next= b;
	            b.next=a;
	            a.next=c;

	            prev=a;
	            
	        }
	        return temp.next;
	    }
}
