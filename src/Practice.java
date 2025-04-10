public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('a',null);
        Node newNode = new Node('x', myNode);
        Node newerNode = new Node('v', newNode);
        Node newestNode = new Node('q', newerNode);

        Node curr = newestNode;
        while (curr!=null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
