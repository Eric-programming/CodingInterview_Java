package Recursion.p12_98_Validate_Binary_Search_Tree;

import Utils.TreeNode;

/**
 * Recommend watch this before begin => https://youtu.be/MvwZRIE8I7I
 */
public class p12_98_Validate_Binary_Search_Tree {

    public static void main(String[] args) {
        TreeNode nodeA1 = new TreeNode(1);
        TreeNode nodeA3 = new TreeNode(3);
        TreeNode nodeA2 = new TreeNode(2, nodeA1, nodeA3);
        System.out.println(isValidBST(nodeA2));// true

        TreeNode nodeB1 = new TreeNode(1);
        TreeNode nodeB3 = new TreeNode(3);
        TreeNode nodeB6 = new TreeNode(6);
        TreeNode nodeB4 = new TreeNode(4, nodeB3, nodeB6);
        TreeNode nodeB5 = new TreeNode(5, nodeB1, nodeB4);
        System.out.println(isValidBST(nodeB5));// false
    }

    private static boolean isValidBSTRecur(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;
        int currentRootValue = root.val;
        // Check if currentRootValue is within the range
        if (min != null && min >= currentRootValue)
            return false;
        if (max != null && max <= currentRootValue)
            return false;

        // Get left and right subtree result
        boolean leftResult = isValidBSTRecur(root.left, min, currentRootValue);
        boolean rightResult = isValidBSTRecur(root.right, currentRootValue, max);

        return leftResult && rightResult;
    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBSTRecur(root, null, null);
    }
}