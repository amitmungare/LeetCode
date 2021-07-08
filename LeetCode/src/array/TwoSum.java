package array;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        
	    HashMap<Integer,Integer> map = new HashMap<>();
	    int num = 0;
	    for(int i = 0; i < nums.length; i++)
	    {
	        if(map.containsKey(nums[i]))
	        {
	            int[] arr = {map.get(nums[i]), i};
	            return arr;
	        }
	        num = target - nums[i];
	        map.put(num, i);
	    }
	    return null;
	        
	    }
	
}
