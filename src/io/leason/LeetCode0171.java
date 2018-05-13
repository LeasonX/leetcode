package io.leason;

/**
 * https://leetcode-cn.com/problems/excel-sheet-column-number/description/
 * <p>
 * 与 Excel表列名称 问题类似。
 * <p>
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * <p>
 * 示例:
 * <p>
 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
 */
public class LeetCode0171 {

    // 'A' 65
    public int titleToNumber(String s) {
        int rs = 0;
        for (char cs : s.toCharArray()) {
            rs = rs * 26 + cs - 64;
        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode0171().titleToNumber("AA"));
    }
}
