class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class GfG {
	// Function to remove duplicates from sorted linked list.
	Node removeDuplicates(Node head) {
		// Your code here
		Node prev = head;
		Node curr = head.next;

		while (curr != null) {
			if (curr.data == prev.data) {
				prev.next = curr.next;
				curr = curr.next;
			} else {
				prev = prev.next;
				curr = curr.next;
			}
		}

		return head;
	}
}
