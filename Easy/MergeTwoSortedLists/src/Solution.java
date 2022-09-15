public class Solution {
    int val;
    Solution next;

    Solution() {
    }

    Solution(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val + " " + next;
    }

    public Solution mergeTwoLists(Solution list1, Solution list2) {
        if (null == list1) {
            return list2;
        }
        if (null == list2) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Solution list1 = new Solution(1);
        list1.next = new Solution(2);
        list1.next.next = new Solution(4);

        Solution list2 = new Solution(1);
        list2.next = new Solution(3);
        list2.next.next = new Solution(4);

        System.out.println(solution.mergeTwoLists(list1, list2));
    }
}

/*
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */