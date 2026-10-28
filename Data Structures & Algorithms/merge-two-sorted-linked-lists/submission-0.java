/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode current = null;
        var list1Ptr = list1;
        var list2Ptr = list2;
        var running = true;
        while (running) {
            if (list1Ptr != null && list2Ptr != null) {
                if (list1Ptr.val < list2Ptr.val) {
                    if (result == null) {
                        result = new ListNode(list1Ptr.val);
                        current = result;
                    } else {
                        var newNode = new ListNode(list1Ptr.val);
                        current.next = newNode;
                        current = newNode;
                    }
                    list1Ptr = list1Ptr.next;
                } else {
                    if (result == null) {
                        result = new ListNode(list2Ptr.val);
                        current = result;
                    } else {
                        var newNode = new ListNode(list2Ptr.val);
                        current.next = newNode;
                        current = newNode;
                    }
                    list2Ptr = list2Ptr.next;
                }
            } else {
                if (list1Ptr != null) {
                    if (result == null) {
                        result = new ListNode(list1Ptr.val);
                        current = result;
                    } else {
                        var newNode = new ListNode(list1Ptr.val);
                        current.next = newNode;
                        current = newNode;
                    }
                    list1Ptr = list1Ptr.next;
                } else if (list2Ptr != null) {
                    if (result == null) {
                        result = new ListNode(list2Ptr.val);
                        current = result;
                    } else {
                        var newNode = new ListNode(list2Ptr.val);
                        current.next = newNode;
                        current = newNode;
                    }
                    list2Ptr = list2Ptr.next;
                }
            }
            if (list1Ptr == null && list2Ptr == null) {
                running = false;
            }
        }
        return result;
    }
}