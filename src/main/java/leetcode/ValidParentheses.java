package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int idx = 0; idx < s.length(); idx++) {
            char checkChar = s.charAt(idx);

            if(checkChar == ')' || checkChar == '}' || checkChar == ']') {
                if(stack.isEmpty()) {
                    return false;
                }

                char prevStart = stack.pop();

                boolean isCorrect = (prevStart == '(' && checkChar == ')') || (prevStart == '{' && checkChar == '}') || (prevStart == '[' && checkChar == ']');
                if(false == isCorrect) {
                    return false;
                }

            } else {
                stack.push(checkChar);
            }
        }

        return stack.isEmpty();
    }

    public boolean isValidUseList(String s) {
        List<Character> list = new ArrayList<>();

        for(int idx = 0; idx < s.length(); idx++) {
            char checkChar = s.charAt(idx);

            if(checkChar == ')' || checkChar == '}' || checkChar == ']') {
                if(list.isEmpty()) {
                    return false;
                }

                char prevStart = list.remove(list.size() - 1);

                boolean isCorrect = (prevStart == '(' && checkChar == ')') || (prevStart == '{' && checkChar == '}') || (prevStart == '[' && checkChar == ']');
                if(false == isCorrect) {
                    return false;
                }

            } else {
                list.add(checkChar);
            }
        }

        return list.isEmpty();
    }
}
