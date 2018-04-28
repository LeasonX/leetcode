package io.leason;

/**
 * https://leetcode-cn.com/problems/binary-number-with-alternating-bits/description/
 * <p>
 * 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 5 输出: True 解释: 5的二进制数是: 101 示例 2:
 * <p>
 * 输入: 7 输出: False 解释: 7的二进制数是: 111 示例 3:
 * <p>
 * 输入: 11 输出: False 解释: 11的二进制数是: 1011 示例 4:
 * <p>
 * 输入: 10 输出: True 解释: 10的二进制数是: 1010
 */
public class LeetCode0693 {

    public boolean hasAlternatingBits(int n) {
        String nBin = Integer.toBinaryString(n);
        for (int i = 0; i < nBin.length() - 1; i++) {
            if(nBin.charAt(i)==nBin.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

}