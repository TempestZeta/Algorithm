package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PalindromeNumberTest {

    PalindromeNumber p = new PalindromeNumber();

    @Test
    void test1() {
        int question = 121;

        boolean result = p.isPalindrome(question);

        assertTrue(result);
    }

    @Test
    void test2() {
        int question = -121;

        boolean result = p.isPalindrome(question);

        assertFalse(result);
    }

    @Test
    void test3() {
        int question = 10;

        boolean result = p.isPalindrome(question);

        assertFalse(result);
    }

    @Test
    void test4() {
        int question = 11;

        boolean result = p.isPalindrome(question);

        assertTrue(result);
    }

    @Test
    void test5() {
        int question = 1001;

        boolean result = p.isPalindrome(question);

        assertTrue(result);
    }

    @Test
    void test6() {
        int question = 123321;

        boolean result = p.isPalindrome(question);

        assertTrue(result);
    }

    @Test
    void test7() {
        int question = 2147483647;

        boolean result = p.isPalindrome(question);

        assertFalse(result);
    }
}