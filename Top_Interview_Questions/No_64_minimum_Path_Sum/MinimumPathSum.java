
/**
 * https://leetcode.com/problems/minimum-path-sum/description/
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][] { { 1, 1, 1, 1, 1 } }));// 5
        System.out.println(minPathSum(new int[][] { { 2 }, { 2 }, { 2 } }));// 6
        System.out.println(minPathSum(new int[][] { {} }));// 0
        System.out.println(minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));// 7
        System.out.println(minPathSum(new int[][] { { 1, 1, 1 }, { 1, 1, 1 } }));// 4
    }

    public static int minPathSum(int[][] grid) {
        // Check Empty
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int endX = grid[0].length - 1, endY = grid.length - 1;

        // Create empty 2d arr
        int[][] dpArr = new int[endY + 1][endX + 1];

        // add each min sum to each position in 2d arr
        for (int y = 0; y <= endY; y++) {
            for (int x = 0; x <= endX; x++) {
                int cur = grid[y][x];
                // within the grid
                if (x > 0 && y > 0) {
                    dpArr[y][x] = Math.min(dpArr[y - 1][x], dpArr[y][x - 1]) + cur;
                }
                // If y is 0
                if (y == 0 && x > 0) {
                    dpArr[y][x] = dpArr[y][x - 1] + cur;
                }
                // if x is 0
                if (x == 0 && y > 0) {
                    dpArr[y][x] = dpArr[y - 1][x] + cur;
                }
                // Starting point
                if (x == 0 && y == 0) {
                    dpArr[y][x] = cur;
                }
            }
        }

        return dpArr[endY][endX];
    }
}