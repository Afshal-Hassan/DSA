
//          ******************              Detect Loop in Linked List             **********************

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static boolean detectLoop(Node head) {

        // Add code here
        boolean isLoopPresent = false;
        Node slowPointer = head;
        Node fastPointer = head;

        if (head.next == null || head == null) {
            return isLoopPresent;
        }

        while (fastPointer.next != null && fastPointer != null) {

            slowPointer = slowPointer.next;

            if (fastPointer.next != null) {
                fastPointer = fastPointer.next;
            }

            if (fastPointer.next != null) {
                fastPointer = fastPointer.next;
            }

            if (fastPointer == slowPointer) {
                isLoopPresent = true;
                break;
            }

        }

        return isLoopPresent;

    }
}