package Time_Complexity;

public class RotateArray {
    public static void rotateArray(int arr[],int d){
        int j=0;
        int[] smallArray=new int[d];

        for (int i=0;i<d;i++){
            smallArray[i]=arr[i];
        }

        for(int i =0;i<arr.length-d;i++){
            arr[i]=arr[i+d];
        }

        for(int i= arr.length-d;i< arr.length;i++){
            arr[i]= smallArray[j++];
        }

    }
}
