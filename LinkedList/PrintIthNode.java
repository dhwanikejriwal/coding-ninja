package LinkedList;

public class PrintIthNode {
    public static void printIthNode(Node<Integer> head, int i){
        Node <Integer> temp=head;
        int count =0;
        while(temp!=null){
            if(count ==i){
                System.out.println(temp.data);
            }
            count ++;
            temp=temp.next;

        }

    }
}
