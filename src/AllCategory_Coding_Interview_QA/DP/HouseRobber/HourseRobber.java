package AllCategory_Coding_Interview_QA.DP.HouseRobber;

public class HourseRobber {
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
     */
    public static int rob(int[] nums) {
        // if length == 0
        if (nums.length == 0) {
            return 0;
        }
        // if length == 1
        if (nums.length == 1) {
            return nums[0];
        }
        // if length == 2
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // else find the max amount that we can take
        int p2 = 0, p1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int cur = Math.max(p1, p2 + nums[i]);
            p2 = p1;
            p1 = cur;
        }
        return p1;
    }
}