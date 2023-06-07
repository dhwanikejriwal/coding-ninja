/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.*/


package Time_Complexity;
import java.util.Arrays;

public class FindUniqueInArray {
    public static int findUnique(int[] arr) {
        //Your code goes here
        Arrays.sort(arr);
        if (arr.length<=1){
            return arr[0];
        }
        if (arr[arr.length-1]!=arr[arr.length-2]){
            return arr[arr.length-1];
        }
        for (int i =1;i<arr.length;i++){
            if(arr[i]==arr[i-1] || arr[i]==arr[i+1]){
                continue;
            }
            else
                return arr[i];
        }
        return 1;

    }
}
