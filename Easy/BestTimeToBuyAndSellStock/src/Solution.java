public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            int delta = price - minPrice;
            if (delta > maxPrice) maxPrice = delta;
        }
        return maxPrice;
    }
}

/*
Input: prices = [7,1,5,3,6,4]
Output: 5
 */
