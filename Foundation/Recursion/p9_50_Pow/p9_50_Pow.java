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
     * Time Limit Exceeded Time Complexity = O(n) Space Complexity = O(1)
     */
    // public static double myPow(double x, int n) {
    // double ans = 1;
    // for (int i = 0; i < Math.abs(n); i++) {
    // ans = ans * x;
    // }
    // if (n < 0) {
    // return 1 / ans;
    // }
    // return ans;
    // }

    /**
     * 2^2 = 2^1 * 2^1
     * 
     * 2^4 = 2^2 * 2^2
     * 
     * 2^8 = 2^4*2^4
     * 
     * 2^16 = 2^8*2^8
     * 
     * Time complexity = O(logn) Space Complexity = O(1)
     */
    public static double myPow(double x, int n) {
        Long N = (long) n;
        if (N < 0) {
            x = 1 / x;// if negative
            N = Math.abs(N);
        }
        double preProduct = 1;
        double curProduct = x;
        while (N > 0) {
            // if n = odd
            if (N % 2 != 0) {
                preProduct *= curProduct;
            }
            curProduct *= curProduct;
            N /= 2;
        }
        return preProduct;
    }

}
