import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(solution.romanToInt(line));
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 1; i > 0; i--) {
            if (map.get(s.charAt(i)) <= map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i - 1));
            } else {
                result -= map.get(s.charAt(i - 1));
            }
        }
        return result;
    }
}

/*
Input: s = "III"
Output: 3
 */