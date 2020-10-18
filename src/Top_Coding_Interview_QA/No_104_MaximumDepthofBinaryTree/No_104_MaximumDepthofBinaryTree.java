package Top_Coding_Interview_QA.No_104_MaximumDepthofBinaryTree;

/**
 * No_104_MaximumDepthofBinaryTree
 */
public class No_104_MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        // [3,9,20,null,null,15,7]
        TreeNode left = new TreeNode(9, null, null);
        TreeNode secondLeft = new TreeNode(15, null, null);
        TreeNode secondRight = new TreeNode(7, null, null);
        TreeNode right = new TreeNode(20, secondLeft, secondRight);
        TreeNode root = new TreeNode(3, left, right);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return maxDepthRecursion(root, 0);
    }

    public static int maxDepthRecursion(TreeNode root, int level) {
        level += 1;
        int leftTotal, rightTotal;
        if (root.left != null) {
            leftTotal = maxDepthRecursion(root.left, level);
        } else {
            leftTotal = 0;
        }
        if (root.right != null) {
            rightTotal = maxDepthRecursion(root.right, level);
        } else {
            rightTotal = 0;
        }
        if (leftTotal == 0 && rightTotal == 0)
            return level;
        return leftTotal < rightTotal ? rightTotal : leftTotal;
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

}
