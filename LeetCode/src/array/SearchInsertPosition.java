package array;

public class SearchInsertPosition {

	public int searchInsert(int[] arr, int t) {
	        
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]==t){
	                return i;
	            }
	            if(arr[i] > t){
	            	return i;
	            }
	        }
	       return arr.length; 
	    }

}
