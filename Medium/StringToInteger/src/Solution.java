import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        String str = scanner.nextLine();
        System.out.println(solution.myAtoi(str));
    }

    public int myAtoi(String str) {
        int i = 0;
        int ans = 0;
        int sign = 1;
        int len = str.length();
        while (i < len && str.charAt(i) == ' ') {
            ++i;
        }
        if (i < len && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i++) == '+' ? 1 : -1;
        }
        for (; i < len; ++i) {
            int tmp = str.charAt(i) - '0';
            if (tmp < 0 || tmp > 9) {
                break;
            }
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && (sign == 1 && tmp > 7 || sign == -1 && tmp > 8))) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                ans = ans * 10 + tmp;
            }
        }
        return sign * ans;
    }
}

/*
Input: s = "4193 with words"
Output: 4193Input: s = "4193 with words"
 */