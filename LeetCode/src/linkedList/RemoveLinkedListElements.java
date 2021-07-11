package linkedList;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int num) {
        if(head ==null){
            return null;
        }
        ListNode temp1 = new ListNode(-1);
        temp1.next = head;
        ListNode temp = temp1;
        
        
        
        while(temp.next != null){
            
            if(temp.next.val == num){                       
                temp.next = temp.next.next;        
            }else{
                temp=temp.next;
            }
            
            
        }
        return temp1.next;
    }
}
