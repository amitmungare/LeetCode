package heap;

import java.util.PriorityQueue;

class Pair{
	int i;
	int j;
	
	public Pair(int i, int j) {
		this.i=i;
		this.j=j;
	}
	
}

public class KthSmallestPrimeFraction {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
    	PriorityQueue<Pair> pq  =new PriorityQueue<Pair>((a,b)->(arr[a.i]*arr[b.j]-arr[b.i]*arr[a.j]));
    	
    	for(int i=0; i<arr.length; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			pq.add(new Pair(i,j));
    		}
    	}
    	
    	Pair p=null;
    	
    	while(k!=0) {
    		p=pq.poll();
    		k--;
    	}
    	
    	return new int[] {arr[p.i],arr[p.j]};
    	
    }
	
}
