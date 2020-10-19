
import java.util.Arrays;

public class No_279_Perfect_Squares {
    public static void main(String[] args) {
        System.out.println(numSquares(13));// 2
        System.out.println(numSquares(16));// 1
        System.out.println(numSquares(0));// 0
        System.out.println(numSquares(26));// 2
        System.out.println(numSquares(12));// 3
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                if (i == 5) {
                    System.out.println("sleep");
                }
                int currentSqrtIndex = i + j * j;
                int currentSqrtValue = dp[currentSqrtIndex];
                int currentValue = dp[i];
                currentValue += 1;
                dp[currentSqrtIndex] = Math.min(currentSqrtValue, currentValue);
            }
        }
        return dp[n];
    }
}