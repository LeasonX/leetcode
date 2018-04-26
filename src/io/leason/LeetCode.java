package io.leason;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/description/
 *
 * 翻转一棵二叉树。

     4
   /   \
  2     7
 / \   / \
 1   3 6   9
 转换为：

      4
    /   \
   7     2
  / \   / \
 9   6 3   1
 备注:
 这个问题是受到 Max Howell 的 原问题 启发 ：

 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您无法在白板上写出翻转二叉树这道题，这太糟糕了。
 */
public class LeetCode {

    //     * Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode result = new TreeNode(root.val);
            if (root.left != null) {
                result.right = invertTree(root.left);
            }
            if (root.right != null) {
                result.left = invertTree(root.right);
            }
            return result;
        }
        return null;
    }

}
