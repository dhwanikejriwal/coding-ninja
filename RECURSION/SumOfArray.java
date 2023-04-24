package RECURSION;

public class SumOfArray {
    public static int sum(int input[]){

        if(input.length==1){
            return input[0];
        }
        if (input.length==2){
            return input[0]+input[1];
        }

        int smallArray[]=new int[input.length-1];
        for(int i =1;i<input.length;i++){
            smallArray[i-1]=input[i];
        }
        int smallSum=sum(smallArray);
        int sum=smallSum+input[0];
        return sum;
    }
    public static void main (String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        System.out.println(sum(arr));
    }
}
