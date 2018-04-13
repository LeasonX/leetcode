package io.leason;

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/description/
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶节点的最长路径上的节点数。
 * <p>
 * 案例： 给出二叉树 [3,9,20,null,null,15,7]，
 * <p>
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 *  返回最大深度为 3 。
 */

public class LeetCode0104 {

    public int maxDepth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        } if (root.left == null && root.right != null) {
            return maxDepth(root.right) + 1;
        } if (root.right == null && root.left != null) {
            return maxDepth(root.left) + 1;
        } if (root.left != null && root.right != null) {
            int leftDepth = maxDepth(root.left) + 1;
            int rightDepth = maxDepth(root.right) + 1;
            return leftDepth > rightDepth? leftDepth : rightDepth;
        }
        return 1;
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

