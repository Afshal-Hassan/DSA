/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node head3 = null;
        Node curr3 = null;
        Node curr1 = head1;
        Node curr2 = head2;
        
        while(curr1 != null && curr2 != null) {
            
            if(curr1.data == curr2.data) {
                Node newNode = new Node(curr1.data);
                
                if(head3 == null) {
                    head3 = newNode;
                    curr3 = newNode;
                }
                
                else {
                    curr3.next = newNode;
                    curr3 = newNode;
                }
                
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            
            else {
                if(curr1.data < curr2.data) {
                    curr1 = curr1.next;
                } else {
                    curr2 = curr2.next;
                }
            }
        }
        
        return head3;
    }
}