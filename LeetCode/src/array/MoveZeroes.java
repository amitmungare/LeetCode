package array;

public class MoveZeroes {
	 public void moveZeroes(int[] arr) {
	       
	        int j=1;
		        int i=0;
		        while(j<arr.length){	            
		            if(arr[i]==0 && arr[j]==0){
		                j++;
		            }else if(arr[i]==0 && arr[j]!=0){
		                int temp =arr[i];
		                arr[i]=arr[j];
		                arr[j]=temp;
		                i++;
		                j++;
		            }else {
		            	i++;
		            	j++;
		            }
		            
		        }
	        
	    }
}
