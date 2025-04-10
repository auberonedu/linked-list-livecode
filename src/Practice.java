public class Practice 
{
    public static void main(String[] args) 
    {
        Node myNode = new Node('A', null); //a, x, v, q,
        Node anotherNode = new Node('X', myNode);
        Node anything = new Node('V', anotherNode);
        Node something = new Node('Q', anything);

        Node current = something;
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
        // current = current.next; 
        // current = current.next; 
        // current = current.next; 
        // current = current.next; 
        // current = something.next; //points to V



        System.out.println(current.data);
    }
}
