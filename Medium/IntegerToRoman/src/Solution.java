import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Solution solution = new Solution();
        int num = scanner.nextInt();
        System.out.println(solution.intToRoman(num));
    }

    public String intToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
}

/*
Input: num = 3
Output: "III"
 */
