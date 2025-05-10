public class Practice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addToFront('W');
        list.addToFront('X');
        list.addToFront('Y');
        list.addToFront('Z');
        System.out.println(list);
        System.out.println(list.get(2));
        // Node myNode = new Node('A', null);
        // Node newNode = new Node ('x', myNode);
        // Node againNode = new Node ('V', newNode);
        // Node finalNodeHopefully = new Node ('Q', againNode);
        
        // Node current = finalNodeHopefully;

        // while(current != null){
        //     System.out.println(current.data);
        //     current = current.next;
        // }
    }
}
