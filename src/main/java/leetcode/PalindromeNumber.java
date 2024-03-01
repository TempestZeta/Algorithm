package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 *
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String s = Integer.toString(x);

        int length = s.length();
        int middle = length / 2;

        for(int idx = 0; idx < middle; idx++) {
            char upper = s.charAt(idx);
            char bottom = s.charAt(length - idx - 1);

            if(upper != bottom) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeFail(int x) {

        if(x < 0) {
            return false;
        }
        int times = 1;

        Map<Integer, Integer> map = new HashMap<>();

        int prevNumber = 0;

        while (true) {

            // overflow
            int decimal = (int)(Math.pow(10, times));

            int remain = (x / decimal) * decimal;

            int result = (x - remain - prevNumber) / ((int)Math.pow(10, times -1));

            map.put(times - 1, result);

            prevNumber += (result * ((int)Math.pow(10 ,times - 1)));

            if(x - prevNumber == 0) {
                break;
            }

            times++;
        }

        int length = map.size();

        int middle = length / 2;

        for(int idx = 0; idx < middle; idx++) {
            int first = map.get(idx);
            int second = map.get(length - idx - 1);

            if(first != second) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeFromLeetCode(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            System.out.println("rev = " + rev);
            x = x/10;
            System.out.println("x = " + x);
        }
        return (x==rev || x==rev/10);
    }

}
