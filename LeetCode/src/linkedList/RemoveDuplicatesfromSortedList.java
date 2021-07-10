package linkedList;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) {
       	return null;
       }
       ListNode temp= head;
       while(head.next != null){
          
           if(head.val == head.next.val){
               head.next = head.next.next;
           }else{
               head=head.next;
           }
           
       }
       return temp;
   }
}
