package ArrayList;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(1,90);
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
//        Enhanced for loop
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(arr.size());
        System.out.println(arr.get(1));
    }
}
