// package Recursion.p4;

public class p4 {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(7);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        ListNode node0 = new ListNode(1, node1);
        ListNode head = new ListNode(6, node0);
        // 61327 => 72316
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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rightNode = reverseList(head.next);
        swap(head, rightNode);
        return rightNode;
    }

    public static void swap(ListNode leftNode, ListNode rightNode) {
        if(rightNode == null){
            return;
        }
        ListNode temp = rightNode.next;
        rightNode.next = leftNode;
        leftNode.next = temp;
        swap(leftNode, leftNode.next);
    }

    // public static ListNode reverseListIteratively(ListNode head) {

    // }

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
