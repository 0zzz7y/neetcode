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
    public boolean hasCycle(ListNode head) {
        List<ListNode> visited = new ArrayList<ListNode>();
        while (head != null) {
            ListNode node = head;
            if (visited.contains(node)) {
                return true;
            }
            visited.add(node);
            head = head.next;
        }
        return false;
    }
}
