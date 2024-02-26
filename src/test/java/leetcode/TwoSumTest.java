package leetcode;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void solution1() {
        TwoSum twoSum = new TwoSum();

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum.twoSumRefactor(nums, target);

        Assumptions.assumeTrue(result[0] == 0);
        Assumptions.assumeTrue(result[1] == 1);
    }

    @Test
    void solution2() {
        TwoSum twoSum = new TwoSum();

        int[] nums = {3,2,4};
        int target = 6;

        int[] result = twoSum.twoSumRefactor(nums, target);

        Assumptions.assumeTrue(result[0] == 1);
        Assumptions.assumeTrue(result[1] == 2);
    }

    @Test
    void solution3() {
        TwoSum twoSum = new TwoSum();

        int[] nums = {3,3};
        int target = 6;

        int[] result = twoSum.twoSumRefactor(nums, target);

        Assumptions.assumeTrue(result[0] == 0);
        Assumptions.assumeTrue(result[1] == 1);
    }
}