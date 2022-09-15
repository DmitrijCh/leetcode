import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(addBinary(line1, line2));
    }

    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1,
                carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            stringBuilder.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            stringBuilder.append(carry);
        return stringBuilder.reverse().toString();
    }
}

/*
Input: a = "11", b = "1"
Output: "100"
 */