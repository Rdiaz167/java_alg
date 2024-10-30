package _02_two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        if(nums == null || nums.length <  2) return null;

        Map<Integer, Integer> comMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(comMap.containsKey(nums[i])) return new int[]{i, comMap.get(nums[i])};

            int complement = target - nums[i];
            comMap.put(complement, i);
        }
        return null;
    }
}
