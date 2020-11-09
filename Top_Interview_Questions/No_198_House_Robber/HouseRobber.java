
/**
 * https://leetcode.com/problems/house-robber/description/
 */
public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[] { 5, 2, 3, 10, 1 }));// 15
        System.out.println(rob(new int[] { 2, 1, 1, 1, 10, 100 }));// 103
        System.out.println(rob(new int[] {}));// 0
        System.out.println(rob(new int[] { 1 }));// 1
        System.out.println(rob(new int[] { 1, 2 }));// 2
        System.out.println(rob(new int[] { 2, 1 }));// 2
        System.out.println(rob(new int[] { 2, 1, 1, 2 }));// 4
    }

    /**
     * Note: It doesn't matter if you use top down or bottom up, you MUST understand
     * the key formula
     * 
     * Time complexity = n
     */
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int curMax = 0, p1 = nums[0], p2 = 0;

        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(nums[i] + p2, p1);
            p2 = p1;
            p1 = curMax;
        }
        return curMax;
    }
}