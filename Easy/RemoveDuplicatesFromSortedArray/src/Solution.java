import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] firstNumbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = solution.removeDuplicates(firstNumbers);
        System.out.println(length);

        int[] secondNumbers = new int[length];
        System.arraycopy(firstNumbers, 0, secondNumbers, 0, length);
        System.out.println(Arrays.toString(secondNumbers));
    }

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}

/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
 */
