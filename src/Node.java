public class Node 
{
    // Attributes
    public char data;
    public Node next;
        // public Node head;

    // Constructor
    public Node(char data, Node next)
    {
        this.data = Character.toLowerCase(data);
        this.next  = next;
            // this.head = this;
    }
    
}