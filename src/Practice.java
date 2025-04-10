public class Practice {
    public static void main(String[] args) {
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~linked lists practice~~~~~~~~~~~~~~~~~~~~~~");

        Node myNode = new Node('A', null);
        Node anotherNode = new Node('X', myNode);
        Node anything = new Node('V', anotherNode);
        Node something = new Node('Q', anything);
        // System.out.println(anotherNode.next.data);

        Node current = something;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
}
