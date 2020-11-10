package Recursion.p4;

public class p4 {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(7);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        ListNode node0 = new ListNode(1, node1);
        ListNode head = new ListNode(6, node0);
        // 61327 => 72316
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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode returnNodeFromBackTracking = reverseList(head.next);
        returnNodeFromBackTracking.next = head;

    }

    public static void swap(ListNode head) {
        ListNode temp = head;

    }

    public static ListNode reverseListIteratively(ListNode head) {

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
