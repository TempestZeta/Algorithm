package leetcode;

/**

 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 *
 * Constraints:
 *
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode prevResult = null;

        boolean isDigitUp = false;

        ListNode currentFirstNode = l1;
        ListNode currentSecondNode = l2;

        while (currentFirstNode!= null || currentSecondNode != null) {

            int num1 = 0;
            int num2 = 0;
            if(currentFirstNode != null) {
                num1 = currentFirstNode.val;
                currentFirstNode = currentFirstNode.next;
            }
            if(currentSecondNode != null) {
                num2 = currentSecondNode.val;
                currentSecondNode = currentSecondNode.next;
            }

            int plusResult = num1 + num2 + (isDigitUp ? 1 : 0);
            if(plusResult >= 10) {
                plusResult -= 10;
                isDigitUp = true;
            } else {
                isDigitUp = false;
            }

            if(result == null) {
                result = new ListNode(plusResult);
            } else {
                if(prevResult == null) {
                    prevResult = new ListNode(plusResult);
                    result.next = prevResult;
                } else {
                    ListNode newNode = new ListNode(plusResult);
                    prevResult.next = newNode;
                    prevResult = newNode;
                }
            }
        }

        if(isDigitUp) {
            if(prevResult != null) {
                prevResult.next = new ListNode(1);
            } else {
                result.next = new ListNode(1);
            }
        }

        return result;
    }

    public static class ListNode {
        ListNode next;
        int val;
        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

