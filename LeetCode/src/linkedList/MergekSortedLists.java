package linkedList;

import java.awt.List;
import java.util.PriorityQueue;

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
 

public class MergekSortedLists {

//	 public ListNode mergeKLists(ListNode[] lists) {
//
//	PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
//		public int compare(ListNode a, ListNode b) {
//			return a.val < b.val ? -1 : 1;
//		}
//	});
//	
//	for(int i=0; i<lists.length;i++) {
//		ListNode head =lists[i];
//		while(head != null) {
//			pq.add(head);
//			head=head.next;
//		}
//	}
//	
//	ListNode newHead = new ListNode(0);
//	ListNode temp = newHead;
//	
//	while(!pq.isEmpty()) {
//		newHead.next =pq.poll();
//		newHead = newHead.next;
//	}
//	newHead.next = null;
//	
//	return temp.next;
//	
//	 }
}
