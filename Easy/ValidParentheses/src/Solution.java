import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        System.out.println(solution.isValid(brackets));
    }

    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> set = new Stack();

        for (Character character : array) {
            if (character == '{' || character == '[' || character == '(') {
                set.push(character);
            } else if (character == ']') {
                if (set.isEmpty() || set.peek() != '[') {
                    return false;
                }
                set.pop();
            } else if (character == ')') {
                if (set.isEmpty() || set.peek() != '(')
                    return false;
                set.pop();
            } else if (character == '}') {
                if (set.isEmpty() || set.peek() != '{')
                    return false;
                set.pop();
            }
        }
        return set.size() == 0;
    }
}

/*
Input: s = "()"
Output: true
 */
