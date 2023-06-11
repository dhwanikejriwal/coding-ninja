package LinkedList;

public class Node<T> {
    T data;
    Node next;
    Node(T data){
        this.data=data;
//        next=null; no need because by default reference is null
    }
}
