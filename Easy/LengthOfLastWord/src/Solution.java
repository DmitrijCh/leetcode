import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solution.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
        int count = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            count++;
        }
        return count;
    }
}

/*
Input: s = "Hello World"
Output: 5
 */
