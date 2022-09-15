import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution.climbStairs(n));
    }

    public int climbStairs(int n) {
        int curr;
        int steps1 = 1;
        int steps2 = 1;

        for (int i = 1; i < n; i++) {
            curr = steps1 + steps2;
            steps2 = steps1;
            steps1 = curr;
        }
        return steps1;
    }
}

/*
Input: n = 2
Output: 2
 */