package Recursion.p4_206_Reverse_LinkedList;

import Utils.ListNode;
import Utils.PrintLinkedList;

public class p4_206_Reverse_LinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node0 = new ListNode(1, node1);
        ListNode head = new ListNode(6, node0);
        // 613 => 316
        head = reverseList(head);
        PrintLinkedList.IterateLinkedlist(head);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static ListNode reverseListIteratively(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode curNode = head, pre = null, nextNode = null;
        while (curNode != null) {
            nextNode = curNode.next;
            curNode.next = pre;
            pre = curNode;
            curNode = nextNode;
        }
        return pre;
    }

}
