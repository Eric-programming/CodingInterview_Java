package Recursion.p8_21_Merge_Two_Sorted_Lists;

import Utils.ListNode;
import Utils.PrintLinkedList;

public class p8_21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode nodeA3 = new ListNode(10, null);
        ListNode nodeA2 = new ListNode(4, nodeA3);
        ListNode nodeA1 = new ListNode(2, nodeA2);
        ListNode nodeA0 = new ListNode(1, nodeA1);// HeadA

        ListNode nodeB2 = new ListNode(4, null);
        ListNode nodeB1 = new ListNode(2, nodeB2);
        ListNode nodeB0 = new ListNode(1, nodeB1);// HeadB
        PrintLinkedList.IterateLinkedlist(mergeTwoLists_2(nodeA0, nodeB0));
    }

    /**
     *
     * Time Complexity = O(n+m) Space Complexity = O(1)
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curNode = new ListNode(-1);
        ListNode res = curNode;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curNode.next = l2;
                l2 = l2.next;
            } else {
                curNode.next = l1;
                l1 = l1.next;
            }
            curNode = curNode.next;
        }

        // Clear left
        if (l1 != null) {
            curNode.next = l1;
        }
        if (l2 != null) {
            curNode.next = l2;
        }
        return res.next;
    }

    /**
     *
     * Time Complexity = O(n+m) Space Complexity = O(n+m)
     */
    /////////////////////////////////////////////////////////////////////////////////////////
    public static ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists_2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_2(l1, l2.next);
            return l2;
        }

    }

}
