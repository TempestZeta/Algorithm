package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    RomanToInteger romanToInteger = new RomanToInteger();
    @Test
    void test1(){
        int result = romanToInteger.romanToInt("III");

        assertEquals(3, result );
    }

    @Test
    void test2(){
        int result = romanToInteger.romanToInt("LVIII");

        assertEquals(58, result );
    }

    @Test
    void test3(){
        int result = romanToInteger.romanToInt("MCMXCIV");

        assertEquals(1994, result );
    }
}