package io.leason;

/**
 * https://leetcode-cn.com/problems/add-digits/description/
 * <p>
 * 给一个非负整数 num，反复添加所有的数字，直到结果只有一个数字。
 * <p>
 * 例如:
 * <p>
 * 设定 num = 38，过程就像： 3 + 8 = 11, 1 + 1 = 2。 由于 2 只有1个数字，所以返回它。
 * <p>
 * 进阶: 你可以不用任何的循环或者递归算法，在 O(1) 的时间内解决这个问题么？
 */
public class LeetCode0258 {

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }

}