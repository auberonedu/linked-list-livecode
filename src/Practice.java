public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('A', null);
        Node anotherNode = new Node('x', myNode);
        Node anything = new Node('V', anotherNode);
        Node something = new Node('Q', anything);

        Node curent = something;

        System.out.println(anotherNode.next.data);
    }
}
