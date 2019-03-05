/**
 * 01
 */
package tencent;
import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	final int number = target - nums[i];
        	if(map.containsKey(number)) {
        		return new int[] {i,map.get(number)};
        	}
			map.put(nums[i], i);
		}
        throw new IllegalArgumentException("No two sum solution");
    }
}
