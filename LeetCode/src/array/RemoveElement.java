package array;

public class RemoveElement {
	public int removeElement(int[] arr, int val) {
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] != val){
             arr[i]=arr[j];
             i++;  
            }            
        }
       return i; 
    
    }
}
