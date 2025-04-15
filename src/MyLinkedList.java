public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public void addToFront(char data) {
        Node newHead = new Node(data, head);
        head = newHead;
    }

    public String toString() {
        int count = 0;
        Node curr = head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return "The count is: " + count;
    }

    public char get(int index) {
        int i = 0;
        Node curr = head;
        while(i<index){
            curr=curr.next;
            i++;
        }
        return curr.data;
    }
}
