package array;

public class MissingNumber {
	 public int missingNumber(int[] arr) {
	        
	       int num=0;
	        
	        for(int i=0; i<=arr.length; i++){
	            num=num^i;
	        }
	        
	        for(int i=0; i<arr.length; i++){
	            num=num^arr[i];
	        }
	  
	       return num;
	    }
}
