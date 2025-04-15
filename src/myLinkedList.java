public class myLinkedList 
{
    //fields
    private Node head;

    //constructors
    public myLinkedList ()
    {
        head = null;
    }

    //methods
    public void addToFront(char data)
    {
        // head = new Node(data, null);
        Node newHead = new Node(data, head);
        head = newHead;
    }

    @Override
    public String toString()
    {
        int count = 0;
        Node current = head;
        while(current != null)
        {
            count++;
            current = current.next;
        }

        return "List with " + count + " nodes";
    }
}
