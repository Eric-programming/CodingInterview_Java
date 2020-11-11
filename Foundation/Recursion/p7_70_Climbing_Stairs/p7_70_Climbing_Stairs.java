package Recursion.p7_70_Climbing_Stairs;

import java.util.Arrays;

public class p7_70_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));// 1
        System.out.println(climbStairs(2));// 2
        System.out.println(climbStairs(3));// 3
        System.out.println(climbStairs(4));// 5 = 2+3
        System.out.println(climbStairs(5));// 8

    }

    // Method 1 => Time Limit Exceeded

    // public static int climbStairs(int n) {
    // if (n < 4) {
    // return n;
    // }
    // return climbStairs(n - 1) + climbStairs(n - 2);
    // }

    // Method 2

    // public static int climbStairs(int n) {
    // if (n < 4) {
    // return n;
    // }
    // int[] cache = new int[n + 1];
    // Arrays.fill(cache, -1);
    // return climbStairsRecur(n, cache);
    // }

    // public static int climbStairsRecur(int n, int[] cache) {
    // if (n < 4) {
    // return n;
    // }
    // if (cache[n] != -1) {
    // return cache[n];
    // }
    // cache[n] = climbStairsRecur(n - 1, cache) + climbStairsRecur(n - 2, cache);
    // return cache[n];
    // }

    // Method 3

    public static int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        int p1 = 2, p2 = 3;
        for (int i = 4; i < n; i++) {
            int temp = p2;
            p2 += p1;
            p1 = temp;
        }
        return p1 + p2;
    }
}
