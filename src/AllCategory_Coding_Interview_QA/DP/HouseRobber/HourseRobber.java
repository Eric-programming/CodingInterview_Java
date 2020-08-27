package AllCategory_Coding_Interview_QA.DP.HouseRobber;

public class HourseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[] { 5, 2, 3, 10, 1 }));
        System.out.println(rob(new int[] { 2, 1, 1, 1, 10, 100 }));
        System.out.println(rob(new int[] {}));
        System.out.println(rob(new int[] { 1 }));
        System.out.println(rob(new int[] { 1, 2 }));
        System.out.println(rob(new int[] { 2, 1 }));
        System.out.println(rob(new int[] { 2, 1, 1, 2 }));
    }

    /**
     * Note: It doesn't matter if you use top down or bottom up, you MUST understand
     * the key formula
     */
    public static int rob(int[] nums) {
        // nums.length == 0
        if (nums.length == 0) {
            return 0;
        }
        // nums.length==1
        if (nums.length == 1) {
            return nums[0];
        }
        // nums.length==2
        if (nums.length == 1) {
            return Math.max(nums[0], nums[1]);
        }
        // nums.length > 2
        int p1 = nums[0], p2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int cur = Math.max(p2 + nums[i], p1);
            p2 = p1;
            p1 = cur;
        }
        return p1;
    }
}