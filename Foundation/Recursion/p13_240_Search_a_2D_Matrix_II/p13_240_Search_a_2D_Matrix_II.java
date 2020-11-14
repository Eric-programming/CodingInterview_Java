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

    public static boolean searchMatrix(int[][] matrix, int target) {
        YLENGTH = matrix.length;
        if (matrix == null || YLENGTH == 0)
            return false;
        XLENGTH = matrix[0].length;
        if (XLENGTH == 0)
            return false;
        return searchMatrixRecur(matrix, target, XLENGTH - 1, 0);
    }

    private static boolean searchMatrixRecur(int[][] matrix, int target, int x, int y) {
        // Check within range
        if (0 > x || 0 > y || XLENGTH - 1 < x || YLENGTH - 1 < y) {
            return false;
        }
        int curPoint = matrix[y][x];
        if (target == curPoint)
            return true;

        // target is smaller then move left
        if (target < curPoint) {
            return searchMatrixRecur(matrix, target, x - 1, y);
        }
        // Target is bigger then move down
        else {
            return searchMatrixRecur(matrix, target, x, y + 1);
        }

    }
}
