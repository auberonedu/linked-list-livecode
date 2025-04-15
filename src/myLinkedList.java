public class myLinkedList {
   private Node head;


   public myLinkedList()
   {
        head = null;
   }


   public void addToFront(char data)
   {
        Node newHead = new Node(data,head);
        head = newHead;
   }

   public char get(int index)
   {
        int i = 0;
        Node current = head;

        while(i < index)
        {
            current = current.next;
            i++;
        }
        return current.data;
   }

   @Override
   public String toString()
   {
        String list = "";
        int count = 0;

        Node current = head;
        // if(current == null)
        // {
        //     return "";
        // }
        while(current != null)
        {
            count++;
            // list =  " -> " + current.data;
            current = current.next;
        }
        return "[" + count + "]";
   }
}
