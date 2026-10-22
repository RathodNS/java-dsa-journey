package arrays;

import java.util.Arrays;

public class rotateArrayByOne {

    static void main() {
        int [] a ={1, 2, 3, 4, 5};
        System.out.println("Rotated Array is as below");
        int [] rotatedArray= rotateArray(a,1);
        Arrays.stream(rotatedArray).forEach(b->System.out.println(b+","));
    }

    public static int[] rotateArray(int[] a,int byPosition){
        if(a==null || a.length<1){
            return a;
        }

       int temp=a[0];
       for (int i=1;i<a.length-1;i++){
           a[i-1]=a[i];
           a[i]=a[i+1];
       }
       a[a.length-1]=temp;

        return a;
    }
}
