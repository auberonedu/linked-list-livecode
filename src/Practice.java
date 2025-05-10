public class Practice {
    public static void main(String[] args) 
    {
        myLinkedList list = new myLinkedList();
        System.out.println(list);

        list.addToFront('W');
        list.addToFront('X');
        list.addToFront('Q');
        list.addToFront('Z');
        list.addToFront('Y');


        System.out.println(list);

        System.out.println(list.get(1));
        // Node myNode = new Node('A', null);

        // Node anotherNode = new Node('X', myNode);

        // Node anything = new Node('V', anotherNode);
        
        // Node something = new Node('Q', anything);
        
        

        // Node current = something;

        // while(current != null)
        // {
        //     System.out.println(current.data);
        //     current = current.next;
        // }


    }
}
