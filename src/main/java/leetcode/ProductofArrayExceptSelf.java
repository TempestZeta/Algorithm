package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 238. Product of Array Except Self
 * Medium
 * Topics
 * Companies
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 *
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */
public class ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] left = new int[nums.length];
        left[0] = 1;
        for(int idx = 1; idx < nums.length; idx++) {
            left[idx] = left[idx -1] * nums[idx - 1];
        }

        int[] right = new int[nums.length];
        right[nums.length -1] = 1;
        for(int idx = nums.length -2; idx >= 0; idx--) {
            right[idx] = right[idx + 1] * nums[idx + 1];
        }

        for(int idx = 0; idx < nums.length; idx++) {
            result[idx] = left[idx] * right[idx];
        }

        return result;
    }
}
