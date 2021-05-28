public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode ptr = result;
        int carryout = 0;
        int digit = 0;
        while (l1 != null) {
            if (l2 != null) {
                digit = l1.val + l2.val + carryout;
                l2 = l2.next;
            } else {
                digit = l1.val + carryout;
            }
            if (digit > 9) {
                carryout = 1;
                digit -= 10;
            } else {
                carryout = 0;
            }

            ptr.next = new ListNode(digit);
            ptr = ptr.next;
            l1 = l1.next;
        }
        while (l2 != null){
            digit = l2.val + carryout;
            if (digit > 9) {
                carryout = 1;
                digit -= 10;
            } else {
                carryout = 0;
            }
            ptr.next = new ListNode(digit);
            ptr = ptr.next;
            l2 = l2.next;
        }
        if (carryout == 1)
            ptr.next = new ListNode(1);
        return result.next;
    }
}
