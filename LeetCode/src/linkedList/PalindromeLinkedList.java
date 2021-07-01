package linkedList;

public class PalindromeLinkedList {

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

public boolean isPalindrome(ListNode head) {
    
     
    
    ListNode slow = head;
    ListNode fast = head;
    
    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    
    ListNode sechead = slow.next;
    slow.next = null;
    sechead = reverseList(sechead);
    
    ListNode ll1 = sechead;
    ListNode ll2 = head;
    
    while(ll1 !=null){
        if(ll1.val != ll2.val){
            return false;
        }
        ll1=ll1.next;
        ll2=ll2.next;
    }
    return true;
     
}
	
}
