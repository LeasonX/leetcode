package io.leason;

/**
 * https://leetcode-cn.com/problems/move-zeroes/description/
 * <p>
 * 给定一个数组 nums, 编写一个函数将所有 0 移动到它的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 例如， 定义 nums = [0, 1, 0, 3, 12]，调用函数之后， nums 应为 [1, 3, 12, 0, 0]。
 * <p>
 * 注意事项:
 * <p>
 * 必须在原数组上操作，不要为一个新数组分配额外空间。 尽量减少操作总数。
 */
public class LeetCode0283 {

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int index = 0;
        for (int n : nums) {
            if (n == 0) {
                zeroCount++;
            } else {
                nums[index] = n;
                index++;
            }
        }
        for (int i = nums.length - 1; i > nums.length - 1 - zeroCount; i--) {
            nums[i] = 0;
        }
    }

}
