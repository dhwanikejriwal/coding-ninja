/*You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.*/

package Time_Complexity;

import java.util.Arrays;

public class TripletSum {
    public static int pairSum(int arr[],int si,int ei,int num){

        int numPairs=0;
        while(si<ei){
            if(arr[si]+arr[ei]<num)
                si++;
            else if(arr[si]+arr[ei]>num)
                ei--;
            else{
                int elementAtStart=arr[si];
                int elementAtEnd=arr[ei];
                if(elementAtStart==elementAtEnd){
                    int totalElement=(ei-si)+1;
                    numPairs+=totalElement*(totalElement-1)/2;
                    return numPairs;
                }
                int tempSi=si+1;
                int tempEi=ei-1;
                while (tempSi<=tempEi && arr[tempSi]==elementAtStart){
                    tempSi++;
                }
                while (tempEi>=tempSi && arr[tempEi]==elementAtEnd){
                    tempEi--;
                }
                int totalELementFromStart=tempSi-si;
                int totalELementFromEnd=tempEi-ei;
                numPairs+=totalELementFromStart*totalELementFromEnd;

                si=tempSi;
                ei=tempEi;
            }
        }
        return numPairs;
    }
    public static int tripletSum(int arr[],int num){
        Arrays.sort(arr);
        int count=0;
        int n = arr.length;
        for (int i =0;i<n;i++){
            int sumForPair=num-arr[i];
            int sumPairs= pairSum(arr,i+1,n-1,sumForPair);
            count+=sumPairs;
        }
        return count;
    }
}
