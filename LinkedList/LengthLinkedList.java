package LinkedList;

public class LengthLinkedList {
    public static int linkedLength(Node<Integer> head){
        int count=0;
        Node<Integer> temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

}
