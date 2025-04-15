public class Practice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list);

        list.addToFront('W');
        list.addToFront('X');
        list.addToFront('Y');
        list.addToFront('Z');
        
        System.out.println(list);
        System.out.println(list.get(2));

        /*
         * Q V X A
         *       c
         */
        // Node myNode = new Node('A', null);
        // Node anotherNode = new Node('X', myNode);
        // Node anything = new Node('V', anotherNode);
        // Node something = new Node('Q', anything);

        // Node current = something;
        // while(current != null) {
        //     System.out.println(current.data);
        //     current = current.next;
        // }
    }
}
