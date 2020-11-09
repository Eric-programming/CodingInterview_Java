import java.util.Arrays;
import java.util.HashMap;

public class No_1_Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int keyToFind = target - nums[i];
            if (hm.containsKey(keyToFind) && hm.get(keyToFind) != i) {
                ans[0] = hm.get(keyToFind);
                ans[1] = i;
                return ans;
            }
            hm.put(nums[i], i);
        }
        return ans;
    }
}
