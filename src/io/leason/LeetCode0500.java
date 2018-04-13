package io.leason;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/keyboard-row/description/
 * <p>
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 * <p>
 * 示例1: 输入: ["Hello", "Alaska", "Dad", "Peace"] 输出: ["Alaska", "Dad"]
 * <p>
 * 注意: 你可以重复使用键盘上同一字符。 你可以假设输入的字符串将只包含字母。
 */
public class LeetCode0500 {

    public String[] findWords(String[] words) {
        List<String> rs = new ArrayList<>();
        Map<Character, Integer> m = new HashMap<>();
        m.put('q', 1);
        m.put('w', 1);
        m.put('e', 1);
        m.put('r', 1);
        m.put('t', 1);
        m.put('y', 1);
        m.put('u', 1);
        m.put('i', 1);
        m.put('o', 1);
        m.put('p', 1);
        m.put('Q', 1);
        m.put('W', 1);
        m.put('E', 1);
        m.put('R', 1);
        m.put('T', 1);
        m.put('Y', 1);
        m.put('U', 1);
        m.put('I', 1);
        m.put('O', 1);
        m.put('P', 1);
        m.put('a', 2);
        m.put('s', 2);
        m.put('d', 2);
        m.put('f', 2);
        m.put('g', 2);
        m.put('h', 2);
        m.put('j', 2);
        m.put('k', 2);
        m.put('l', 2);
        m.put('A', 2);
        m.put('S', 2);
        m.put('D', 2);
        m.put('F', 2);
        m.put('G', 2);
        m.put('H', 2);
        m.put('J', 2);
        m.put('K', 2);
        m.put('L', 2);
        m.put('z', 3);
        m.put('x', 3);
        m.put('c', 3);
        m.put('v', 3);
        m.put('b', 3);
        m.put('n', 3);
        m.put('m', 3);
        m.put('Z', 3);
        m.put('X', 3);
        m.put('C', 3);
        m.put('V', 3);
        m.put('B', 3);
        m.put('N', 3);
        m.put('M', 3);
        for (String w : words) {
            boolean b = true;
            int a = m.get(w.charAt(0));
            int len = w.length();
            for (int i = 1; i < len; i++) {
                if (m.get(w.charAt(i)) != a) {
                    b = false;
                    break;
                }
            }
            if (b) {
                rs.add(w);
            }
        }
        return rs.toArray(new String[rs.size()]);
    }

}
