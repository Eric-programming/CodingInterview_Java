package Recursion.p5_700_Search_in_a_BinarySearchTree;

import Utils.PrintBST;
import Utils.TreeNode;

public class p5_700_Search_in_a_BinarySearchTree {

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(7);
        TreeNode node = new TreeNode(4, node2, node3);

        // print2D(node);
        PrintBST.print2D(searchBST(node, 2));
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (val > root.val) {
            return searchBST(root.right, val);// search right side
        } else {
            return searchBST(root.left, val);// search left side
        }
    }

}
