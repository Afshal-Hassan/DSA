
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        int count = 1;
        int index = 1;
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
            count = count + 1;
        }
        count = count - n + 1;
        if (count <= 0) {
            return -1;
        }

        curr = head;
        while (index < count) {
            curr = curr.next;
            index = index + 1;
        }
        return curr.data;
    }
}
