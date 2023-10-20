class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        int countOf0s = 0;
        int countOf1s = 0;
        int countOf2s = 0;

        Node curr = head;

        while (curr != null) {
            if (curr.data == 0) {
                countOf0s++;
                curr = curr.next;
            } else if (curr.data == 1) {
                countOf1s++;
                curr = curr.next;
            } else {
                countOf2s++;
                curr = curr.next;
            }
        }

        Node newCurr = head;

        while (newCurr != null) {

            if (countOf0s != 0) {
                newCurr.data = 0;
                countOf0s--;
                newCurr = newCurr.next;
            } else if (countOf1s != 0) {
                newCurr.data = 1;
                countOf1s--;
                newCurr = newCurr.next;
            } else {
                newCurr.data = 2;
                countOf2s--;
                newCurr = newCurr.next;
            }
        }

        return head;
    }
}