public class Practice {
    public static void main(String[] args) {
        System.out.println("~linked lists practice~");
        Node<Character> myNode = new Node<Character>('A',null);
        Node<Character> newNode = new Node<Character>('x', myNode);
        Node<Character> anything = new Node<Character>('V', newNode);
        Node<Character> something = new Node<Character>('Q', anything);
       

        Node<Character> current = something;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
