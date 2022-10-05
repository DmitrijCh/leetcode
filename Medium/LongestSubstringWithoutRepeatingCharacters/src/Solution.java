import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        String s = scanner.nextLine();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) return 0;
        int pre = 0, max = 0;
        int[] hash = new int[128];
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            if (hash[c] > pre) {
                pre = hash[c];
            }
            int l = i - pre + 1;
            hash[c] = i + 1;
            if (l > max) max = l;
        }
        return max;
    }
}

/*
Input: s = "abcabcbb"
Output: 3
 */

