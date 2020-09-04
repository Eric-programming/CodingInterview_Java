package Top_Coding_Interview_QA.No_279_Perfect_Squares;

import java.util.Arrays;
import java.util.HashSet;

public class No_279_Perfect_Squares {
    public static void main(String[] args) {
        System.out.println(numSquares(13));// 2
        // System.out.println(numSquares(16));// 1
        // System.out.println(numSquares(0));// 0
        // System.out.println(numSquares(26));// 2
        // System.out.println(numSquares(12));// 3

    }

    // public static int numSquares(int n) {
    // // HashSet<Integer> set = new HashSet<>();
    // int count = 0;
    // int tempN = n;
    // for (int i = n; i > 0; i--) {
    // // check if perfect squre
    // String t = Double.toString(Math.sqrt(Math.abs(i)));
    // int decimalIndex = t.indexOf('.');
    // int num = t.length() - decimalIndex - 1;
    // if (num == 1 && t.charAt(decimalIndex + 1) == '0' || num == 0) {
    // // check if tempN - i == 0 then return count else count++ and tempN -=i;
    // int result = tempN - i;
    // if (result == 0) {
    // return ++count;
    // } else if (n % i == 0) {
    // count = count > n / i ? n / i : count;
    // } else if (result > 0) {
    // count++;
    // tempN = result;
    // }
    // }
    // }
    // return count;
    // }
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                dp[i + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
            }
        }
        return dp[n];
    }
}