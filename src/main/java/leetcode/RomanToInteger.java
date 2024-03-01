package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.  (IV, IX)
 * X can be placed before L (50) and C (100) to make 40 and 90. (XL, XC)
 * C can be placed before D (500) and M (1000) to make 400 and 900. (CD, CM)
 * Given a roman numeral, convert it to an integer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */


public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;

        boolean isPrevComplicated = false;
        int prevNumber = 0;

        for (int idx = 0; idx < s.length(); idx++) {
            char checkChar = s.charAt(idx);
            int convertedNumber = plusValue(checkChar);

            // 5의 배수는 합성 숫자가 될 가능성이 있다.
            if (false == isPrevComplicated && convertedNumber % 5 == 0 && prevNumber < convertedNumber) {
                isPrevComplicated = true;
                result -= (prevNumber * 2);
            }

            result += convertedNumber;

            prevNumber = convertedNumber;

            if(true == isPrevComplicated) {
                isPrevComplicated = false;
            }
        }

        return result;
    }

    private int plusValue(char currChar) {
        int returnValue = 0;
        switch (currChar) {
            case 'I':
                returnValue = 1;
                break;
            case 'V':
                returnValue = 5;
                break;
            case 'X':
                returnValue = 10;
                break;
            case 'L':
                returnValue = 50;
                break;
            case 'C':
                returnValue = 100;
                break;
            case 'D':
                returnValue = 500;
                break;
            case 'M':
                returnValue = 1000;
                break;
        }

        return returnValue;
    }
}
