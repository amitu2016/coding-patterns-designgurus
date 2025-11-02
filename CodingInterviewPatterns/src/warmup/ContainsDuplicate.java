package warmup;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
	    Map<Integer,Integer> map = new HashMap<>();
	    int n = nums.length;
	    for(int i = 0; i < n; i++){
	      int freq = 1;
	      int key = nums[i];
	      if(map.containsKey(key)){
	        map.put(key,map.get(key)+1);
	      }else{
	        map.put(key,freq);
	      }
	    }

	    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	      if(entry.getValue() > 1)
	        return true;
	    }

	    return false;
	  }

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {1,2,1,4};
		
		System.out.println(containsDuplicate(nums1));
		System.out.println(containsDuplicate(nums2));

	}

}
