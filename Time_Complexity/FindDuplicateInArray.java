/*You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
*/

package Time_Complexity;

import java.util.Arrays;

public class FindDuplicateInArray {
    public static int findDuplicate(int[] arr) {
    Arrays.sort(arr);
        if (arr.length<=1){
        return arr[0];
    }

        for (int i =1;i<arr.length;i++){
        if(arr[i]==arr[i-1] || arr[i]==arr[i+1]){
            return arr[i];
        }
        else
            continue;
    }
        return 1;

}

}
