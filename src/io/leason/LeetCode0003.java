package io.leason;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 * <p>
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例：
 * <p>
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * <p>
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * <p>
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 */
public class LeetCode0003 {

    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) {
            return 0;
        }
        int rs = 1;
        char[] cs = s.toCharArray();
        if (s.length() == 1) {
            return 1;
        }
        int index = -1;
        for (int i = 1; i < cs.length; i++) {
            int l = 1;
            for (int j = i - 1; j >= index + 1; j--) {
                if (cs[i] == cs[j]) {
                    rs = rs > l ? rs : l;
                    index = j;
                    break;
                } else {
                    l++;
                }
            }
            rs = rs > l ? rs : l;
        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode0003().lengthOfLongestSubstring("au"));
    }

}
