package Recursion.p13_240_Search_a_2D_Matrix_II;

public class p13_240_Search_a_2D_Matrix_II {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        System.out.println(searchMatrix(arr, 5));// true
        System.out.println(searchMatrix(arr, 20));// false
        int[][] arr2 = { { -1, 3 } };
        System.out.println(searchMatrix(arr2, -1));// true

    }

    private static int XLENGTH = -1;
    private static int YLENGTH = -1;
    /**
     * 
     * Space Complexity = O(n+m) Time Complexity = O(n+m)
     */
    // public static boolean searchMatrix(int[][] matrix, int target) {
    // YLENGTH = matrix.length;
    // if (matrix == null || YLENGTH == 0)
    // return false;
    // XLENGTH = matrix[0].length;
    // if (XLENGTH == 0)
    // return false;
    // return searchMatrixRecur(matrix, target, XLENGTH - 1, 0);
    // }

    // private static boolean searchMatrixRecur(int[][] matrix, int target, int x,
    // int y) {
    // // Check within range
    // if (0 > x || 0 > y || XLENGTH - 1 < x || YLENGTH - 1 < y) {
    // return false;
    // }
    // int curPoint = matrix[y][x];
    // if (target == curPoint)
    // return true;

    // // move left if target is less than current point
    // if (target < curPoint) {
    // return searchMatrixRecur(matrix, target, x - 1, y);
    // }
    // // move down if target is more than current point
    // else {
    // return searchMatrixRecur(matrix, target, x, y + 1);
    // }

    // }
    /**
     * 
     * Space Complexity = O(1) Time Complexity = O(n+m)
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        YLENGTH = matrix.length;
        if (matrix == null || YLENGTH == 0)
            return false;
        XLENGTH = matrix[0].length;
        if (XLENGTH == 0)
            return false;
        int x = XLENGTH - 1;
        int y = 0;
        int curVal;
        while (0 <= x && x < XLENGTH && 0 <= y && y < YLENGTH) {
            curVal = matrix[y][x];
            // check current point
            if (curVal == target) {
                return true;
            }
            // move left if target is less than current point
            if (target < curVal) {
                x--;
            }
            // move down if target is more than current point
            if (target > curVal) {
                y++;
            }
        }
        return false;
    }
}
