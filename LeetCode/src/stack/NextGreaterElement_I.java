package stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement_I {

	public int[] nextGreaterElement(int[] n1, int[] n2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack();
        
        for(int n : n2){
            while(!s.isEmpty() && s.peek() <n){
                map.put(s.pop(),n);
            }
            s.push(n);
        }
        
        for(int i=0; i<n1.length; i++){
            n1[i] = map.getOrDefault(n1[i], -1);
        }
        return n1;
    }
	
}
