package OOPS1;
import java.util.*;
import java.util.ArrayList;
class DynamicArray{
    int nextElementIndex;
    int data[];
    //constructor
    public DynamicArray(){
        data=new int[5];
        nextElementIndex=0;
    }
    //to get size of an array
    public int size(){
        return nextElementIndex;
    }
    //check whether array is empty
    public boolean isEmpty(){
        return nextElementIndex==0;
    }
    //to get element at ith index
    public int get(int i){
        if(i>=nextElementIndex){
            return -1;
        }
        return data[i];
    }
    //to change the element at the given index
    public void set(int i,int element){
        data[i]=element;
    }
    //add new element at the index
    public void add(int element){
        if (nextElementIndex==data.length){
            doubleCapacity();
        }
        data[nextElementIndex]=element;
        nextElementIndex++;
    }
    //for making the capacity of array double and making it dynamic
    private void doubleCapacity(){

        int temp[]=data;
        data =new int[2*temp.length];
        for (int i =0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    //removing the elementt at last and returning it
    public int removeLast()
    {  if (nextElementIndex==0){
        return -1;
    }
        int temp = data[nextElementIndex-1];
        data[nextElementIndex-1]=0;
        nextElementIndex--;
        return temp;
    }

}
public class DynamicArrayUSe {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        DynamicArray d1 = new DynamicArray();
        for (int i = 0; i < n; i++) {
            d1.add(i + 1);
        }
        System.out.println(d1.size());
        System.out.println(d1.get(7));
        d1.set(2, 60);
        System.out.println(d1.get(2));
        System.out.print(d1.get(1) + " ");
        System.out.print(d1.get(2) + " ");
        System.out.print(d1.get(3) + " ");
        System.out.print(d1.get(4) + " ");
        System.out.print(d1.get(5) + " ");
        System.out.print(d1.get(6) + " ");
        System.out.print(d1.get(7) + " ");

        while (!d1.isEmpty()) {
            System.out.println(d1.removeLast());
            System.out.println("size- " + d1.size());
        }
    }
}

