public class Practice {
    public static void main(String[] args) {
        
        Node myNode = new Node ('A', null); //shows its the end of the list since it points to null
        Node anotherNode = new Node ('X', myNode); //points to myNode, so anotherNode is in the front
        Node anything = new Node ('V', anotherNode);
        Node idkSomething = new Node ('Q', anything);

        Node current = idkSomething;
        // current = current.nextNode; //expected res: V
        // current = current.nextNode; //expected res: X
        // current = current.nextNode; //expected res: A
        // current = current.nextNode; //expected res: Null, once current is null the list ends

        while(current!=null){
            System.out.println(current.dataValue);
            current = current.nextNode; //goes while the current doesn't equal null
        }//end while

        System.out.println("~"+ anotherNode.nextNode.dataValue +"~");//uses the instance variable name, without the instance variable it shows the memory location

    }//end main
}//end class Practice
