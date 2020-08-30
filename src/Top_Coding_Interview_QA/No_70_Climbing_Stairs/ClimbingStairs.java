package Top_Coding_Interview_QA.No_70_Climbing_Stairs;

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 * 
 * dpArr[i] = dpArr[i-1] + dpArr[i-2];
 * 
 * distinctWays of n = total distinct way of n -1 + total distinct way of n-2
 * 
 * 1+2+1 2+1+1 1+1+1+1 1+1+2 2+2
 */

public class ClimbingStairs {
    public static void main(String[] args) {

        System.out.println(ClimbingStairMethod(1));// 1
        System.out.println(ClimbingStairMethod(2));// 2
        System.out.println(ClimbingStairMethod(3));// 3
        System.out.println(ClimbingStairMethod(4));// 5
        System.out.println(ClimbingStairMethod(5));// 8

    }

    public static int ClimbingStairMethod(int n) {
        int[] dpArr = new int[n + 1];
        for (int i = 0; i < dpArr.length; i++) {
            if (i < 4) {
                dpArr[i] = i;
            } else {
                dpArr[i] = dpArr[i - 1] + dpArr[i - 2];
            }
        }
        return dpArr[dpArr.length - 1];
    }

}