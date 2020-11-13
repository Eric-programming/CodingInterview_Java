package Utils;

public class PrintLinkedList {
    public static void IterateLinkedlist(ListNode head) {
        if (head == null) {
            return;
        }
        String ans = "";
        while (head.next != null) {
            ans += head.val + "=>";
            head = head.next;
        }
        System.out.println(ans + head.val);
    }
}
