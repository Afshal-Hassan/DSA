class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    //Your code here
    
    if(head == null || head.next == null) {
        return head;
    }
    
    
    Node curr = head ;
    Node currNext = curr.next;
    Node prev = null ;
    
    
    while(curr.next != null) {
         curr.next = prev;
         curr.prev = currNext;
         prev = curr; 
         curr = currNext;
         currNext = currNext.next; 
    }  
    
         curr.next = prev;
         curr.prev = currNext;
         head = curr;
         return head;
    
     
}