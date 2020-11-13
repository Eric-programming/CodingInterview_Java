package Recursion.p8_21_Merge_Two_Sorted_Lists;

import Utils.ListNode;
import Utils.PrintLinkedList;

public class p8_21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode nodeA3 = new ListNode(10, null);
        ListNode nodeA2 = new ListNode(4, nodeA3);
        ListNode nodeA1 = new ListNode(2, nodeA2);
        ListNode nodeA0 = new ListNode(1, nodeA1);// HeadA
        // IterateLinkedlist(nodeA0);

        ListNode nodeB2 = new ListNode(4, null);
        ListNode nodeB1 = new ListNode(2, nodeB2);
        ListNode nodeB0 = new ListNode(1, nodeB1);// HeadB
        // IterateLinkedlist(nodeB0);
        PrintLinkedList.IterateLinkedlist(mergeTwoLists(nodeA0, nodeB0));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // filtering data
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode finalAns;
        // Init set up
        if (l1.val > l2.val) {
            finalAns = new ListNode(l2.val);
            l2 = l2.next;
        } else {
            finalAns = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode head = finalAns;// Capture the value
        // Iterate and compare
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                finalAns.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                finalAns.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            finalAns = finalAns.next;
        }
        // Remove remaining nodes
        if (l1 != null) {
            finalAns.next = l1;
        }
        if (l2 != null) {
            finalAns.next = l2;
        }
        return head;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    public static ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    public static ListNode mergeTwoLists_3(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

}
