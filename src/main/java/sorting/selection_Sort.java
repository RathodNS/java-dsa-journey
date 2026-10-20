package sorting;

import java.util.Arrays;

public class selection_Sort {


    public static int[] sort(int[] a){

        for(int i =0;i<=a.length-2;i++){
            int minIndex = i;

            for(int j=i+1;j<=a.length-1;j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            swap(a,i,minIndex);
        }


        return a;
    }


    public static int[] swap(int[] a, int b, int c){

        int temp = a[b];
        a[b]=a[c];
        a[c] =temp;

        return a;
    }


    static void main() {
        int[] arr = {2,5,1,9,4,10,8};
        sort(arr);

       Arrays.stream(arr).forEach(a->System.out.print(a+","));
    }



}
