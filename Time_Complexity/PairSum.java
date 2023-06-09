package Time_Complexity;

import java.util.Arrays;

public class PairSum {
    public static int pairSum(int arr[],int num){
        Arrays.sort(arr);
        int si=0;
        int ei=arr.length;
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
                    numPairs+=(totalElement*(totalElement-1)/2);
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
                int totalELementFromEnd=ei-tempEi;
                numPairs+=totalELementFromStart*totalELementFromEnd;

                si=tempSi;
                ei=tempEi;
            }
        }
        return numPairs;
    }
}
