package arrays;

import java.util.Arrays;

public class rotateArrayByKElements {


    static void main() {
        int[] a = {1,2,3,4,5,6,7};
        int[] aCopy = a.clone();
        int [] rotatedArray= rotateByKPosition(a,5);
//
        Arrays.stream(rotatedArray).forEach(b->System.out.print(b+","));

        System.out.println("-----------");

        int [] rotatedArrayOptimized = rotateArrayOptimized(aCopy,5);
        Arrays.stream(rotatedArrayOptimized).forEach(c->System.out.print(c+","));

    }

    // TS = o(n) and SC =o(K)
    public static int[] rotateByKPosition(int[] a,int k){
        if(a == null || a.length<1){
            return a;
        }

        if(k>a.length){
            return null;
        }
        int[] temp = new int[k];
        for(int i =0;i<k;i++){
            temp[i]=a[i];
        }
        for(int j =k;j<a.length;j++){
            a[j-k]=a[j];
        }
        int index=0;
       for(int l=temp.length; l>0;l--){
           a[a.length-l] =temp[index++];

       }

        return a;
    }

    // TS = o(n) and SC =o(1)
    public static int[] rotateArrayOptimized(int[] a , int k){
        if(a == null || a.length<1){
            return a;
        }

        if(k>a.length){
            return null;
        }

        reverse(a, 0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
        return a;





    }
    public static int[] reverse(int[] a, int start, int end){

        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }


        return a;
    }





}
