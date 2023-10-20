class Solution {
    public static Node getListAfterDeleteOperation(Node head) {
        // Write your code here.

        if (head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (prev.data > curr.data) {
                if (curr.next != null) {
                    if (curr.data < curr.next.data) {
                        prev.next = curr.next;
                        prev = prev.next;
                        curr = prev.next;

                    } else {
                        curr = curr.next;
                    }
                } else {
                    prev = prev.next;
                    curr = prev.next;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;

    }
}