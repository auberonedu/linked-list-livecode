public class Practice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addToFront('a');
        list.addToFront('b');
        list.addToFront('c');

        System.out.println(list.toString());
        
        System.out.println(list.get(1));

        // Node myNode = new Node('a',null);
        // Node newNode = new Node('x', myNode);
        // Node newerNode = new Node('v', newNode);
        // Node newestNode = new Node('q', newerNode);

        // Node curr = newestNode;
        // while (curr!=null) {
        //     System.out.println(curr.data);
        //     curr = curr.next;
        // }
    }
}
