package io.leason;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 * <p>
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class LeetCode0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode listNode = new ListNode(sum % 10);
        ListNode nextListNode = listNode;
        l1 = l1.next;
        l2 = l2.next;
        int ten = sum / 10;
        while (null != l1 || null != l2 || ten != 0) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            //计算和
            sum = l1.val + l2.val + ten;
            nextListNode.next = new ListNode(sum % 10);
            nextListNode = nextListNode.next;
            l1 = l1.next;
            l2 = l2.next;
            ten = sum / 10;

        }
        return listNode;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
//        ListNode listNode11 = new ListNode(4);
//        ListNode listNode111 = new ListNode(3);
//        listNode1.next = listNode11;
//        listNode11.next = listNode111;

        ListNode listNode2 = new ListNode(5);
//        ListNode listNode22 = new ListNode(6);
//        ListNode listNode222 = new ListNode(4);
//        listNode2.next = listNode22;
//        listNode22.next = listNode222;

        ListNode listNode = new LeetCode0002().addTwoNumbers(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
