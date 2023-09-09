package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                list[0] = map.get(target - nums[i]);
                list[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return list;
    }

}
