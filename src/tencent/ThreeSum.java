package tencent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length<3) {
			return new ArrayList<List<Integer>>();
		}
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
        	map.put(nums[i], i);
		}
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int thirdNumber = 0-nums[i]-nums[j];
				if(map.keySet().contains(thirdNumber)
						&&map.get(thirdNumber)>j) {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(thirdNumber);
					list.sort(null);;
					if (!res.contains(list)) {
						res.add(list);
					}
				}
			}
		}
        return res;
    }
	
	public static void main(String[] args) {
		ThreeSum threeSum = new ThreeSum();
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		List<List<Integer>> list =  threeSum.threeSum(nums);
		System.out.println(list);
	}
}
