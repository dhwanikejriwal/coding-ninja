package LinkedList;

public class LinkedListDemo {
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
//        System.out.println("n1 "+ n1 +" data "+n1.data+" next "+n1.next);
        n2.next = n3;
//        System.out.println("n2 "+ n2 +" data "+n2.data+" next "+n2.next);
        n3.next = n4;
//        System.out.println("n3 "+ n3 +" data "+n3.data+" next "+n3.next);
        n4.next = null;
//        System.out.println("n4 "+ n4 +" data "+n4.data+" next "+n4.next);
        return n1;
    }

        public static void print(Node<Integer> head){
//           Method 1 of printing data
//            System.out.println("Print"+head);
//            System.out.println(head.data);
//            System.out.println(head.next);
//            System.out.println(head.next.data);
//            System.out.println(head.next.next.data);

//method 2 of printing the data
            Node<Integer> temp=head;
             while(temp!=null){
                 System.out.println(temp.data);
                 temp=temp.next;
             }

        }

    public static void incrementElement(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }



    public static void main(String args[]){

         Node<Integer> head=createLinkedList();
         incrementElement(head);
         print(head);

//        Node <Integer>n1=new Node<>(20);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
//        System.out.println(n1);

//        Node<String> n2=new Node<>("Dhwani");
//        System.out.println(n2.data);
//        System.out.println(n2.next);

    }
}
