import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] array = new String[number];
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextLine();
        }
        System.out.print(solution.longestCommonPrefix(array));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int i = 0;
        while (true) {
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j - 1].length() <= i
                        || strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                i++;
            } else {
                break;
            }
        }
        return strs[0].substring(0, i);
    }
}

/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
