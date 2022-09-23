import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int rowIndex = scanner.nextInt();
        System.out.println(solution.getRow(rowIndex));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            result.add(1);
            for (int j = i - 1; j > 0; --j) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }
        return result;
    }
}

/*
Input: rowIndex = 3
Output: [1,3,3,1]
 */
