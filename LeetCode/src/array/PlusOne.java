package array;

public class PlusOne {
	public int[] plusOne(int[] arr) {
        
		 for(int i=arr.length-1; i>=0;i--) {
		 if(arr[i]<9) {
		 arr[i]++;
		 return arr;
		 }
		 arr[i]=0;
		 }
		 
		 int[] res = new int[arr.length+1];
		 res[0]=1;
		 return res;
       
   }
}
