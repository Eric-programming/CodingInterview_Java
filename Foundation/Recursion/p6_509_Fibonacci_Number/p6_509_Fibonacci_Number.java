package Recursion.p6_509_Fibonacci_Number;

import java.util.Arrays;

public class p6_509_Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println(fib(2));// 1
        System.out.println(fib(3));// 2
        System.out.println(fib(4));// 3
    }

    /**
     * 
     * Time Complexity = 2^n
     */
    // public static int fib(int N) {
    // if (N <= 1) {
    // return N;
    // }
    // return fib(N - 1) + fib(N - 2);
    // }

    public static int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int[] cache = new int[N + 1];
        Arrays.fill(cache, -1);
        return fib_recur(N, cache);
    }

    /**
     * 
     * Time Complexity O(n)
     */
    public static int fib_recur(int N, int[] cache) {
        if (N <= 1) {
            return N;
        }
        if (cache[N] != -1) {
            return cache[N];
        }
        cache[N] = fib_recur(N - 1, cache) + fib_recur(N - 2, cache);
        return cache[N];
    }
}
