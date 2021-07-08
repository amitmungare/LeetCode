package bitManipulation;

public class SingleNumber {
	public int singleNumber(int[] arr) {
        int num=arr[0];
            for(int i=1; i<arr.length; i++){
                num= num^arr[i];
            }
        return num;
    }
}
