package Recursion.p4;

public class p4 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node0 = new ListNode(1, node1);
        ListNode head = new ListNode(6, node0);
        // 613 => 316
        head = reverseList(head);
        IterateLinkedlist(head);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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

    public static void IterateLinkedlist(ListNode head) {
        if (head == null) {
            return;
        }
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);
    }

}
