package Recursion.p11_95_Unique_Binary_Search_Trees_II;

import java.util.ArrayList;
import java.util.List;

import Utils.TreeNode;

public class p11_95_Unique_Binary_Search_Trees_II {

    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        return generateTreesRecur(1, n);
    }

    private static List<TreeNode> generateTreesRecur(int S, int E) {
        List<TreeNode> res = new ArrayList<>();
        if (S > E) {
            res.add(null);
            return res;
        }
        for (int i = S; i <= E; i++) {
            // left combinations of current root i
            List<TreeNode> leftList = generateTreesRecur(S, i - 1);
            // right combinations of current root i
            List<TreeNode> rightList = generateTreesRecur(i + 1, E);
            for (TreeNode left : leftList) {
                for (TreeNode right : rightList) {
                    TreeNode curNode = new TreeNode(i);// Add current root
                    curNode.left = left;
                    curNode.right = right;
                    res.add(curNode);
                }
            }
        }
        return res;
    }

}
