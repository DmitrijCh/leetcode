import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(solution.mySqrt(x));
    }

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        double r = 1;
        while (Math.abs(r * r - x) > 0.00001) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }
}

/*
Input: x = 4
Output: 2
 */
