package io.leason;

/**
 * https://leetcode-cn.com/problems/max-consecutive-ones/description/
 * <p>
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,0,1,1,1] 输出: 3 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3. 注意：
 * <p>
 * 输入的数组只包含 0 和1。 输入数组的长度是正整数，且不超过 10,000。
 */
public class LeetCode0485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        if (nums.length == 1) {
            if (nums[0] == 1) {
                return 1;
            }
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                result = result >= temp? result : temp;
                temp = 0;
            }
        }
        return result > temp? result : temp;
    }

}
