package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses s = new ValidParentheses();

    @Test
    void test1() {
        String str = "()[]{}";
        assertTrue(s.isValid(str));
    }
}