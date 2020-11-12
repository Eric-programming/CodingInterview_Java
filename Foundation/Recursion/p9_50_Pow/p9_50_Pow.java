package Recursion.p9_50_Pow;

public class p9_50_Pow {
    public static void main(String[] args) {

        System.out.println(myPow(0.00001, 2147483647));// 0.0
        System.out.println(myPow(2.0, 10));// 1024.0
        System.out.println(myPow(2.0, 4));// 16.0
        System.out.println(myPow(3.0, 2));// 9.0
        System.out.println(myPow(2.0, -1));// 0.5
        System.out.println(myPow(2.0, -2));// 0.25

    }

    /**
     * 
     * 2^-2 = 2^-1 * 2^-1
     * 
     * Time Complexity = O(n) Space Complexity = O(1)
     */
    // public static double myPow(double x, int n) {
    // if (n < 0) {
    // n = -n;
    // x = 1 / x;
    // }
    // double finalAns = 1;
    // for (int i = 0; i < n; i++) {
    // finalAns *= x;
    // }
    // return finalAns;
    // }

    /**
     * 2^4 = 2^2 * 2^2
     * 
     * 2^-2 = 2^-1 * 2^-1
     * 
     * 
     * Time complexity = O(logn) Space COmplexity = O(1)
     */
    public static double myPow(double x, int n) {
        Long N = (long) n;
        if (N < 0) {
            x = 1 / x;// if negative
            N = -N;
        }
        double res = 1;
        double doubleProduct = x;
        while (N > 0) {
            // if n = odd
            if (N % 2 != 0) {
                res *= doubleProduct;
            }
            doubleProduct *= doubleProduct;
            N /= 2;
        }
        return res;
    }

}
