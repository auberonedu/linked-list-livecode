public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public void addToFront(char data) {
        Node newHead = new Node(data, head);
        head = newHead;
    }

    public char get(int index) {
        int i = 0;
        Node current = head;
        while (i < index) {
            current = current.next;
            i++;
        }

        return current.data;
    }

    @Override
    public String toString() {
        /*
         * count = 0
         * current = head
         * 
         * while current:
         *   count++
         *   current -> current.next
         * 
         * return "List with COUNT nodes"
         */
        int count = 0;
        Node current = head;

        while(current != null) {
            count++;
            current = current.next;
        }

        return "List with " + count + " nodes.";
    }
}
