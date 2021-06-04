package bitManipulation;

public class ConvertBinaryNumberinaLinkedListtoInteger {

	public int getDecimalValue(ListNode head) {
        
        int count =0;
        ListNode temp =head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int num =count-1;
        count = 0;
        
        while(head != null){
            if(head.val == 1){
                count += (int) Math.pow(2,num);
            }
            num--;
            head = head.next;
        }
        return count;
    }
}
