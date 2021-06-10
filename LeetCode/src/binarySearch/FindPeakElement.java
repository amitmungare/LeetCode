package binarySearch;

public class FindPeakElement {

	
	public static int findPeakElement(int[] arr) {
		
		int si = 0;
		int ei = arr.length-1;
		
		while(si<ei){
			int mid = si+(ei-si)/2;
			
			if(arr[mid]<arr[mid+1]) {
				si=mid+1;
			}else {
				ei=mid;
			}
		}
		return si;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1};
		System.out.println(findPeakElement(arr));
	}

	

}
