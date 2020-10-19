
/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit_2(new int[] { 7, 1, 5, 3, 6, 4 }));// 5
        System.out.println(maxProfit_2(new int[] { 7, 6, 4, 3, 1 }));// 0
        System.out.println(maxProfit_2(new int[] { 1, 2, 3, 4, 5, 6 }));// 5
        System.out.println(maxProfit_2(new int[] { 1, 1, 1, 1, 1, 1 }));// 0
        System.out.println(maxProfit_2(new int[] { 2, 4, 1 }));// 2
        System.out.println(maxProfit_2(new int[] { 0, 6, -3, 7 }));// 10

    }

    /**
     * Time Complexity: n
     */
    public static int maxProfit_2(int[] prices) {
        // filter data
        if (prices.length < 2) {
            return 0;
        }

        // find the max profit
        int minStock = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - minStock, maxProfit);
            minStock = Math.min(prices[i], minStock);
        }
        return maxProfit;
    }
}