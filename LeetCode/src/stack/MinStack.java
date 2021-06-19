package stack;

import java.util.Stack;

public class MinStack {

	Stack<Integer> s= new Stack();
    Stack<Integer> min= new Stack();
    
    public void push(int ele) {
        
          if(min.isEmpty() || ele <= min.peek()){
              min.push(ele);
          }  
	    s.push(ele);
    }
    
    public void pop() {
        if(s.peek().equals(min.peek())){
            min.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
