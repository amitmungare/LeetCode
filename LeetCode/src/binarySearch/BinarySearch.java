package binarySearch;

public class BinarySearch {
	
	
	private static int binarySearch(int[] arr,int t) {
		
		int si=0;
		int ei=arr.length-1;		
		
		while(si<=ei) {
			int mid=(si+ei)/2;
			
			if(arr[mid]==t) {
				return mid;
				
			}else if(t < arr[mid]) {
				ei=mid-1;
				
			}else{
				si = mid+1;
			}			
		}
		return -1;
	}


	public static void main(String[] args) {	
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr,72));		
	}

	
}
