package Top_Coding_Interview_QA.No_213_House_Robber_II;

/**
 * https://leetcode.com/problems/house-robber-ii/description/
 */
public class HouseRobber2 {
    public static void main(String[] args) {
        System.out.println(rob(new int[] { 5, 2, 3, 10, 1 }));// 15
        System.out.println(rob(new int[] { 2, 1, 1, 1, 10, 100 }));// 1+1+100=102
        System.out.println(rob(new int[] {}));// 0
        System.out.println(rob(new int[] { 1 }));// 1
        System.out.println(rob(new int[] { 1, 2 }));// 2
        System.out.println(rob(new int[] { 2, 1, 1, 2 }));// 2+1
    }

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
        // 0 -> nums.length -2 OR 1-> nums.length-1
        int opt1 = cacluateMaxRob(nums, 0, nums.length - 2);
        int opt2 = cacluateMaxRob(nums, 1, nums.length - 1);
        return Math.max(opt1, opt2);
    }

    public static int cacluateMaxRob(int[] nums, int start, int end) {
        int p1 = nums[start], p2 = 0;
        for (int i = start + 1; i <= end; i++) {
            int cur = Math.max(p2 + nums[i], p1);
            p2 = p1;
            p1 = cur;
        }
        return p1;
    }
}