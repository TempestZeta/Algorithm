package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 1. Two Sum
 * Easy
 * Topics
 * Companies
 * Hint
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int idx = 0; idx < nums.length; idx++) {

            List<Integer> idxList = map.computeIfAbsent(nums[idx], k -> new ArrayList<>());
            idxList.add(idx);
        }

        for(Map.Entry<Integer, List<Integer>> keyAndIdx : map.entrySet()) {
            int required = target - keyAndIdx.getKey();

            if(required == keyAndIdx.getKey()) {
                List<Integer> idxList = keyAndIdx.getValue();
                if(idxList.size() == 1) {
                    continue;
                }

                result[0] = idxList.get(0);
                result[1] = idxList.get(1);
                return result;
            }

            if(map.containsKey(required)) {
                List<Integer> idxList = map.get(required);
                result[0] = keyAndIdx.getValue().get(0);
                result[1] = idxList.get(0);

                return result;
            }
        }

        return result;
    }

}
