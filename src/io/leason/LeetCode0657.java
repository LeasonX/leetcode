package io.leason;

/**
 * https://leetcode-cn.com/problems/judge-route-circle/description/
 * <p>
 * 初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，换言之就是判断它是否会移回到原来的位置。
 * <p>
 * 移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。机器人有效的动作有 R（右），L（左），U（上）和 D（下）。输出应为 true 或 false，表示机器人移动路线是否成圈。
 * <p>
 * 示例 1: 输入: "UD" 输出: true
 * <p>
 * 示例 2: 输入: "LL" 输出: false
 */
public class LeetCode0657 {

    public boolean judgeCircle(String moves) {
        int a = 0;
        int b = 0;
        for (char s : moves.toCharArray()) {
            switch (s) {
            case 'R':
                a++;
                break;
            case 'L':
                a--;
                break;
            case 'U':
                b++;
                break;
            case 'D':
                b--;
                break;
            }
        }
        return a == b && b == 0;
    }

}
