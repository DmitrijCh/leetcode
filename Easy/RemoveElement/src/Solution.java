public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(solution.removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}

/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
 */
