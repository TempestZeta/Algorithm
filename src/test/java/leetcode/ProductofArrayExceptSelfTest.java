package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ProductofArrayExceptSelfTest {
    ProductofArrayExceptSelf s = new ProductofArrayExceptSelf();
    @Test
    void test1() {
        int[] nums = {1,2,3,4};
        int[] output = {24,12,8,6};

        int[] result = s.productExceptSelf(nums);
        Assertions.assertArrayEquals(result, output);
    }
}