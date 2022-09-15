public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.print(solution.deleteDuplicates(ListNode.createTestData("[1,1,2]")));
        ListNode.print(solution.deleteDuplicates(ListNode.createTestData("[1,1,2,3,3]")));
    }
}

/*
Input: head = [1,1,2]
Output: [1,2]
 */