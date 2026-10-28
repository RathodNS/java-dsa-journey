package arrays.logicBuilding;

import java.util.Arrays;

public class MoveZerosToEnd {


   public static void main(String[] args) {
       int[] a = {1,2,0,3,0,4,5,0,6,0};

       int[] resultArray1 =  moveZerosToEndBruteForce(a);
       Arrays.stream(resultArray1).forEach(b->System.out.print(b+","));

       int[] resultArray =  moveZerosToEnd(a);
        Arrays.stream(resultArray).forEach(b->System.out.print(b+","));

    }

    public static int[] moveZerosToEndBruteForce(int[] a){

       for( int i =0;i<a.length-1;i++){
           for(int j=0;j<a.length-1;j++){

               if(a[j]==0){
                    int temp= a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }

           }
       }

       return a;
    }

    public static int[] moveZerosToEnd(int [] a){

       int zeroPoolSize=0;

       for(int i =0;i<a.length-1;i++){

           if(a[i]==0){
               zeroPoolSize++;
           }else if(zeroPoolSize>0){
               int temp = a[i];
               a[i]=0;
               a[i-zeroPoolSize]=temp;
           }
       }

        return a;
    }

    public static int[] swap(int[] a, int start, int end){
       a[start] = a[start]+a[end];
       a[end] = a[start]-a[end];
       a[start] = a[start]-a[end];

       return a;
    }
}
