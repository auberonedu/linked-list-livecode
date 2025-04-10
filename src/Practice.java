public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('A', null);
        Node newNode = new Node ('x', myNode);
        Node againNode = new Node ('V', newNode);
        Node finalNodeHopefully = new Node ('Q', againNode);
        
        Node current = finalNodeHopefully;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
