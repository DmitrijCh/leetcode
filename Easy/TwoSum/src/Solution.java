import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String... args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int[] numbers = new int[size];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int target = Integer.parseInt(reader.readLine());
        System.out.println(Arrays.toString(solution.twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            Integer num = target - numbers[i];
            if (index.containsKey(num)) {
                return new int[]{index.get(num), i};
            }
            index.put(numbers[i], i);
        }
        return null;
    }
}

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
 */