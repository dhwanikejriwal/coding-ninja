package LinkedList;

public class IncrementEveryElem {
    public static void incrementElement(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }
}
