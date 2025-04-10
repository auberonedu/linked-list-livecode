public class Practice {
    public static void main(String[] args) {
        System.out.println("~linked lists practice~");

        Node myNode = new Node('A', null);
        Node anotherNode = new Node('X', myNode);
        Node aNode = new Node('V', anotherNode);
        Node theNode = new Node('Q', aNode);

        Node cur = theNode;

        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        
    }
}
