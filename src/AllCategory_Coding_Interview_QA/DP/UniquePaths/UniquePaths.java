package AllCategory_Coding_Interview_QA.DP.UniquePaths;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));// 28
        System.out.println(uniquePaths(3, 2));// 3

    }

    public static int uniquePaths(int m, int n) {
        // check if m or n is 0
        if (m == 0 || n == 0) {
            return 1;
        }
        // create a dpArr filled with 1
        int[][] dpArr = new int[m][n];// m = y, n = x

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                // if y OR x is 0 then current position = 1
                if (y == 0 || x == 0) {
                    dpArr[y][x] = 1;
                }
                // else current position is equal to left + top
                else {
                    dpArr[y][x] = dpArr[y - 1][x] + dpArr[y][x - 1];
                }
            }
        }
        return dpArr[m - 1][n - 1];
    }

}