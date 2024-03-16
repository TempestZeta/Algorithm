package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix s = new LongestCommonPrefix();

    @Test
    void test1() {
        String[] strs = {"flower","flow","flight"};
        String output = "fl";

        String result = s.longestCommonPrefix(strs);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String[] strs = {"dog","racecar","car"};
        String output = "";

        String result = s.longestCommonPrefix(strs);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String[] strs = {"","b"};
        String output = "";

        String result = s.longestCommonPrefix(strs);

        assertEquals(output, result);
    }
}