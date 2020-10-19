
/**
 * https://leetcode.com/problems/maximum-subarray/submissions/
 */
public class No_53_Maximum_Subarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));// 6
        System.out.println(maxSubArray(new int[] {}));// 0
        System.out.println(maxSubArray(new int[] { -2, 1 }));// 1
        System.out.println(maxSubArray(new int[] { -1, 1, 2, 1 }));// 4
    }

    /**
     * Time Complexity: n
     */
    public static int maxSubArray(int[] nums) {
        // filter data
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // find the max value up to the current position
        int[] dpArr = new int[nums.length];
        dpArr[0] = nums[0];
        int max = dpArr[0];
        for (int i = 1; i < dpArr.length; i++) {
            dpArr[i] = Math.max(dpArr[i - 1] + nums[i], nums[i]);
            max = Math.max(dpArr[i], max);
        }
        return max;
    }
}