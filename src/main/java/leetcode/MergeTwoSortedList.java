package leetcode;

import java.util.PriorityQueue;

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        while (list1 != null || list2 != null) {
            if(list1 != null) {
                queue.add(list1.val);
                list1 = list1.next;
            }

            if(list2 != null) {
                queue.add(list2.val);
                list2 = list2.next;
            }
        }

        if(false == queue.isEmpty()) {
            ListNode result = new ListNode(queue.poll());
            ListNode nextNode = null;
            while (false == queue.isEmpty()) {
                if(nextNode == null) {
                    nextNode = new ListNode(queue.poll());
                    result.next = nextNode;
                } else {
                    ListNode newNode = new ListNode(queue.poll());
                    nextNode.next = newNode;
                    nextNode = newNode;
                }
            }

            return result;
        }

        return null;
    }

    private static class ListNode {
        int val;
        ListNode next;

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
