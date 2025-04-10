public class Practice {
    public static void main(String[] args) 
    {
        // Node setup
        Node myNode = new Node('A', null);
        Node anotherNode = new Node('X', myNode);
        Node anything = new Node('V', anotherNode);
        Node something = new Node('Q', anything);

        // Current Reference
        Node current = something;

        // Print out
        while (current != null) 
        {
            System.out.println(current.data);
            current = current.next;
        }

    }

}
