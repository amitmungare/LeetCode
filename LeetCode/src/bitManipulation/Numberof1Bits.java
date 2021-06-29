package bitManipulation;

public class Numberof1Bits {
	 public int hammingWeight(int n) {
	        int count=0;
	        
	        while(n!=0){
	            count++;           
	            n=n&(n-1);
	        }
	        return count;
	    }
}
