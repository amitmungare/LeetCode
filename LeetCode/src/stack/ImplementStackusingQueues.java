package stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

	Queue<Integer> q =new LinkedList<Integer>();
   
    public void push(int x) {
       q.add(x); 
        for(int i=0; i<q.size()-1; i++){
            q.add(q.poll());
        }
    }
    
    public int pop() {
      return q.poll();  
    }
    
    public int top() {
       return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
	
}
