package Time_Complexity;
public class ArrayIntersection {
    public static void merge(int s1[],int s2[],int r[]){
        int i=0;
        int j=0;
        int k =0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<s2[j]){
                r[k]=s1[i];
                i++;
            }
            else {
                r[k] = s2[j];
                j++;
            }
            k++;
        }
        if(i<s1.length){
            while(i< s1.length){
                r[k]=s1[i];
                k++;
                i++;
            }
        if(j<s2.length){
            while(j<s2.length){
                r[k]=s2[j];
                k++;
                j++;
            }
        }
        }
    }
    public static void mergeSort(int a[]){
        if(a.length==0){
            return;
        }
        int b[]=new int[a.length/2];
        int c[]=new int[a.length-b.length];
        for (int i =0;i<a.length/2;i++){
            b[i]=a[i];
        }
        for (int i=a.length/2;i<a.length;i++){
            c[i-a.length/2]=a[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,a);
    }
    public static void arrayIntersection (int arr1[],int arr2[]){
        mergeSort(arr1);
        mergeSort(arr2);
        int m =arr1.length;
        int n =arr2.length;
        int i=0;
        int j=0;
        while (i<m && j<n){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                j++;
                i++;
            }
            else if (arr1[i]<arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }
    }
}

