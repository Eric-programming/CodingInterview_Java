package Recursion.p2;

/**
 * p2
 */
public class p2 {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(7);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        ListNode node0 = new ListNode(1, node1);
        ListNode head = new ListNode(6, node0);
        head = swapPairs(head);
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

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode returnNodeFromBackTracking = swapPairs(head.next.next);// receive the node from back tracking

        head = swap(head);// swap head and head.next

        head.next.next = returnNodeFromBackTracking;// Point to the node that was return from backtracking

        return head;
    }

    public static ListNode swap(ListNode head) {
        // filter data
        if (head == null || head.next == null) {
            return head;
        }
        // swap pair
        ListNode temp = head;
        head = head.next;
        head.next = temp;

        return head;
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