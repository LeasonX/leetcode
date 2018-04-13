package io.leason;

import java.math.BigDecimal;

/**
 * https://leetcode-cn.com/problems/sum-of-two-integers/description/
 * <p>
 * 不使用运算符 + 和-，计算两整数a 、b之和。
 * <p>
 * 示例： 若 a = 1 ，b = 2，返回 3。
 */
public class LeetCode0371 {

    public int getSum(int a, int b) {
        return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).intValue();
    }
}
