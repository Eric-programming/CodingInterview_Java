package Recursion.p10_96_Unique_Binary_Search_Trees;

public class p10_96_Unique_Binary_Search_Trees {
    public static void main(String[] args) {
        System.out.println(numTrees(3));// 5
        System.out.println(numTrees(1));// 1
        System.out.println(numTrees(4));// 14
        System.out.println(numTrees(5));// 42

    }

    // Get total combinations for the given n
    public static int numTrees(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 3) {
            return n;
        }
        int totalCombinations = 0;
        for (int i = 1; i <= n; i++) {
            totalCombinations += AllCombinationsForCurrentRoot(i, n);
        }
        return totalCombinations;
    }

    // Get total combinations for given root
    private static int AllCombinationsForCurrentRoot(int root, int totalNodes) {
        return numTrees(root - 1) * numTrees(totalNodes - root);
    }

}
