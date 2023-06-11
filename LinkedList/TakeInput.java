package LinkedList;
import java.util.*;

public class TakeInput {
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
//        Node<Integer> head=null;
//        while(data !=-1){
//            Node<Integer> currentNode=new Node<>(data);
//            if(head==null){
////                Make this head node
//                head=currentNode;
//            }
//            else{
//                Node<Integer> tail=head;
//                while(tail.next!=null){
//                    tail=tail.next;
//                }
//                tail.next=currentNode;
//            }
//            data=sc.nextInt();
//
//        }

//        method 2
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
//                Make this head node
                head = currentNode;
                tail = currentNode;
            } else {

                tail.next = currentNode;
                tail = tail.next;
            }

            data=sc.nextInt();

        }
        return head;
    }
        public static void main (String args[]){
            Node<Integer> head = takeInput();
        }
    }

