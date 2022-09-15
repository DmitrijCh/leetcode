import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(solution.plusOne(array)));
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }

        if (carry > 0) {
            int[] sum = new int[digits.length + 1];
            sum[0] = carry;
            System.arraycopy(digits, 0, sum, 1, sum.length - 1);
            return sum;
        } else
            return digits;
    }
}

/*
Input: digits = [1,2,3]
Output: [1,2,4]
 */
