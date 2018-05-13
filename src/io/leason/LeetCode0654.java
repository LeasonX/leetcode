package io.leason;

/**
 * https://leetcode-cn.com/problems/maximum-binary-tree/description/
 * <p>
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * <p>
 * 二叉树的根是数组中的最大元素。 左子树是通过数组中最大值左边部分构造出的最大二叉树。 右子树是通过数组中最大值右边部分构造出的最大二叉树。 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * <p>
 * Example 1:
 * <p>
 * 输入: [3,2,1,6,0,5] 输入: 返回下面这棵树的根节点：
 * <p>
 *    6
 *  /   \
 * 3     5
 * \    /
 * 2  0
 *  \
 *  1
 * 注意:
 * <p>
 * 给定的数组的大小在 [1, 1000] 之间。
 */
public class LeetCode0654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if(nums == null || nums.length == 0){
            return null;
        }
        if(nums.length == 1){
            return new TreeNode(nums[0]);
        }
        int max = nums[0];
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        int[] leftArray = new int[index];
        int[] rightArry = new int[nums.length - index - 1];
        for(int i = 0; i < index; i++){
            leftArray[i] = nums[i];
        }
        for(int i = 0;i<nums.length-index-1;i++){
            rightArry[i] = nums[index + i + 1];
        }
        TreeNode t = new TreeNode(max);
        t.left = constructMaximumBinaryTree(leftArray);
        t.right = constructMaximumBinaryTree(rightArry);
        return t;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
