package io.leason;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4 输出：1->1->2->3->4->4
 */
public class LeetCode0021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        result = new ListNode(Math.min(l1.val, l2.val));
        if (result.val == l1.val) {
            result.next = mergeTwoLists(l1.next, l2);
        } else {
            result.next = mergeTwoLists(l1, l2.next);
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
