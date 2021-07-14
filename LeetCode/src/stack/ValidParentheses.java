package stack;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String exp) {
        
        
        Stack<Character> s = new Stack();
        
        for(int i=0; i<exp.length(); i++){
            
            if(exp.charAt(i)=='(' || exp.charAt(i)=='[' || exp.charAt(i)=='{') {					
					s.push(exp.charAt(i));
			}
            
            if(exp.charAt(i)==')') {
                if(s.isEmpty()) return false;
                
                if(s.peek()=='(') {
                    s.pop();						
                }else {
                    return false;
                }
                
            }
            
            if(exp.charAt(i)=='}') {
                if(s.isEmpty()) return false;
                
                if(s.peek()=='{') {
                    s.pop();						
                }else {
                    return false;
                }
                
            }
            
            if(exp.charAt(i)==']') {
                if(s.isEmpty()) return false;
                
                if(s.peek()=='[') {
                    s.pop();						
                }else {
                    return false;
                }
                
            }
    
        }
       if(!s.isEmpty()) {
			return false;
	    }
			return true; 
        
    }
}
