package io.leason;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/range-sum-query-immutable/description/
 * <p>
 * 给定一个数组，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 * <p>
 * 例如：
 * <p>
 * 给定nums = [-2, 0, 3, -5, 2, -1]，求和函数为sumRange()
 * <p>
 * sumRange(0, 2) -> 1 sumRange(2, 5) -> -1 sumRange(0, 5) -> -3 注意:
 * <p>
 * 你可以假设数组不可变。 会多次调用 sumRange 方法。
 */
public class LeetCode0303 {

    class NumArray{

        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            return 0;
        }
    }

}
