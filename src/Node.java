public class Node {
    public char data;
    public Node next;

    /*
     * Constructor that's being used in line 3 in Practice.java
     */
    public Node(char data, Node next) {
        this.data = data;       // this.data = Character.toLowerCase(value); || great example of how its not just "this.data = data" or "this.data = value"
        this.next = next;
    }
}