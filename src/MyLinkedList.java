public class MyLinkedList {
    private Node head;

    public MyLinkedList(){
        head = null;
    }

    public void addToFront(char data){
        Node newHead = new Node(data, head);
        head = newHead;
    }

    public char get(int index){
        Node tail = head;
        for(int i = 0; i < index; i++){
            tail = tail.next;
        }
        return tail.data;
    }

    @Override public String toString() {
        int count = 0;
        Node tail = head;
        while(tail != null){
            count++;
            tail = tail.next;
        }
        return "Count: " + count;
    }
}
