import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int num = scanner.nextInt();
        System.out.println(solution.generateParenthesis(num));
    }

    public List<String> generateParenthesis(int n) {
        Map<Integer, List<String>> hashMap = new HashMap<>();
        hashMap.put(0, Collections.singletonList(""));
        for (int i = 1; i <= n; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String fj : hashMap.get(j)) {
                    for (String fi_j_1 : hashMap.get(i - j - 1)) {
                        list.add("(" + fi_j_1 + ")" + fj);
                    }
                }
            }
            hashMap.put(i, list);
        }
        return hashMap.get(n);
    }
}

/*
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
 */