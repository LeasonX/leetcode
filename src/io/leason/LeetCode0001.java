package io.leason;

/**
 * https://leetcode-cn.com/problems/two-sum
 * <p>
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 */
public class LeetCode0001 {

    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int c = 1;
        while (a < nums.length - 1) {
            while (c < nums.length) {
                if (nums[a] + nums[c] == target) {
                    return new int[] { a, c };
                }
                c++;
            }
            a++;
            c = a + 1;
        }
        return null;
    }

}
