import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(solution.isPalindrome(number));
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right)
                return false;

            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}

/*
Input: x = 121
Output: true
 */
