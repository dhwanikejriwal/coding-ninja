package RECURSION;

public class CheckArraySorted {
    public static boolean isSorted(int arr[]){
        if(arr.length==0){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int[] smallArray=new int[arr.length-1];
        for(int i=1;i<arr.length;i++) {
            smallArray[i - 1] = arr[i];
        }
            boolean isSmallArraySorted=isSorted(smallArray);
            return isSmallArraySorted;
    }
    public static void main(String args[]){
        int arr[]={1,4,6,2};


        System.out.println(isSorted(arr));
    }
}
