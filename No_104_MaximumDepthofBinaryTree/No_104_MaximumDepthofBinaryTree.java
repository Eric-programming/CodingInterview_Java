import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println(maxDepth2(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        int maxDepthValue = Math.max(leftMaxDepth, rightMaxDepth);
        return 1 + maxDepthValue;
    }

    public static int maxDepth2(TreeNode root) {

        HashMap<TreeNode, Integer> TrackLevel = new HashMap<>();// HashMap Track
        Queue<TreeNode> visited = new LinkedList<>();// Visited Queue
        int maxDepthValue = 1;

        TrackLevel.put(root, 1);
        visited.add(root);

        while (visited.isEmpty() != true) {
            TreeNode curTreeNode = visited.remove();// remove the head
            int maxlevelAtCurrentNode = TrackLevel.get(curTreeNode);
            maxDepthValue = maxlevelAtCurrentNode;
            if (curTreeNode.left != null) {
                TreeNode leftTreeNode = curTreeNode.left;
                visited.add(leftTreeNode);
                TrackLevel.put(leftTreeNode, maxlevelAtCurrentNode + 1);
            }
            if (curTreeNode.right != null) {
                TreeNode rightTreeNode = curTreeNode.right;
                visited.add(rightTreeNode);
                TrackLevel.put(rightTreeNode, maxlevelAtCurrentNode + 1);
            }
        }
        return maxDepthValue;
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
