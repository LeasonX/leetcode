package io.leason;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/description/
 * <p>
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1: 输入: "Let's take LeetCode0226 contest" 输出: "s'teL ekat edoCteeL tsetnoc"
 * <p>
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class LeetCode0557 {

    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuffer sb = new StringBuffer();
        int len = ss.length;
        for (int i = 0; i < len - 1; i++) {
            sb.append(new StringBuffer(ss[i]).reverse()).append(' ');
        }
        sb.append(new StringBuffer(ss[len - 1]).reverse());
        return sb.toString();
    }

}
