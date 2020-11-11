package Recursion.p5_700_Search_in_a_BinarySearchTree;

public class p5_700_Search_in_a_BinarySearchTree {

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(7);
        TreeNode node = new TreeNode(4, node2, node3);

        // print2D(node);
        print2D(searchBST(node, 2));
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

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static final int COUNT = 10;

    // Function to print binary tree in 2D
    // It does reverse inorder traversal
    public static void print2DUtil(TreeNode root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    public static void print2D(TreeNode root) {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}
