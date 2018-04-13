package io.leason;

/**
 * https://leetcode-cn.com/problems/reverse-string/description/
 * <p>
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 * <p>
 * 示例：
 * <p>
 * 输入：s = "hello" 返回："olleh"
 */
public class LeetCode0344 {

    public String reverseString(String s) {
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length / 2; i++) {
            char temp = cs[i];
            cs[i] = cs[cs.length - i - 1];
            cs[cs.length - i - 1] = temp;
        }
        return new String(cs);
    }
}
