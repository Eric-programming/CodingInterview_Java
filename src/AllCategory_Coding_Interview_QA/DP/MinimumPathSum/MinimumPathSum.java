package AllCategory_Coding_Interview_QA.DP.MinimumPathSum;

import java.util.HashMap;

public class MinimumPathSum {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][] { { 1, 1, 1, 1, 1 } }));// 5
        System.out.println(minPathSum(new int[][] { { 2 }, { 2 }, { 2 } }));// 6
        System.out.println(minPathSum(new int[][] { {} }));// 0
        System.out.println(minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));// 7
        System.out.println(minPathSum(new int[][] { { 1, 1, 1 }, { 1, 1, 1 } }));// 4
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
    }

    public static int minPathSum(int[][] grid) {
        // Check Empty
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        // Use Memoization
        HashMap<Point, Integer> map = new HashMap<>();
        // Find the min sum
        return minPathSum(grid, 0, 0, 0, map);
    }

    // y = rows
    // x = columns
    public static int minPathSum(int[][] grid, int y, int x, int count, HashMap<Point, Integer> map) {
        // check if out of bound return -1
        if (y >= grid.length || x >= grid[0].length) {
            return -1;
        }
        if (map.get(new Point(x, y)) != null) {
            return map.get(new Point(x, y));
        }
        // Increment count
        count += grid[y][x];

        // check if reach the end return count values
        int endX = grid[0].length - 1;
        int endY = grid.length - 1;
        if (x == endX && y == endY) {
            return count;
        }
        // compare right and down to find min sum
        int right = minPathSum(grid, y, x + 1, count, map);
        int down = minPathSum(grid, y + 1, x, count, map);

        // check if 1d
        if (right == -1) {
            return down;
        }
        if (down == -1) {
            return right;
        }
        int min = Math.min(right, down);
        map.put(new Point(x, y), min);
        return min;
    }
}