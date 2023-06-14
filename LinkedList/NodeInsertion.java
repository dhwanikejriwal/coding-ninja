package LinkedList;

public class NodeInsertion {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        //Your code goes here
        Node<Integer> currentNode=new Node<>(data);

        if(pos==0){
            currentNode.next=head;
            head=currentNode;
            return currentNode;
        }
        Node<Integer> prev=head;
        int count=0;

        while(count<pos-1 && prev!=null){
            count++;
            prev=prev.next;
        }
        if(prev!=null){
            currentNode.next=prev.next;
            prev.next=currentNode;
        }
        return head;


    }
}

