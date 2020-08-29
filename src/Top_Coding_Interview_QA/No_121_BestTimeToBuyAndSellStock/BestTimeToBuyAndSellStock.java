package Top_Coding_Interview_QA.No_121_BestTimeToBuyAndSellStock;

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
     * Time Complexity: n^2
     */
    public static int maxProfit(int[] prices) {
        // filter
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        // create dpArr
        int[] dp = new int[prices.length];

        // Find the max value that each position can sell for
        for (int i = 0; i < dp.length; i++) {
            int max = prices[i];
            for (int j = i + 1; j < dp.length; j++) {
                if (max < prices[j]) {
                    max = prices[j];
                }
            }
            // once we found the max value at the current position, we find the profit
            dp[i] = max - prices[i];
        }

        // iterate the entire dpArr and find the max profit value
        int maxProfit = dp[0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i] > maxProfit) {
                maxProfit = dp[i];
            }
        }
        return maxProfit;
    }

    /**
     * Time Complexity: n
     */
    public static int maxProfit_2(int[] prices) {
        // filter data
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        // find the max profit
        int maxProfit = 0, maxProfitSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(0, maxProfit += prices[i] - prices[i - 1]);// find the max profit at the current index
            maxProfitSoFar = Math.max(maxProfit, maxProfitSoFar);// find the max profit up to this current index
        }
        return maxProfitSoFar;
    }
}