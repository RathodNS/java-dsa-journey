package sorting;

public class bubbleSort {

    // here we run the outer loop from right end of the array so that we can reduce the number of iterations in the inner loop as the largest elements will be at the end of the array after each iteration of the outer loop.
    public static int[] sortingBs(int[] a){

        for(int i =a.length-1;i>0;i--){
            boolean swapped = false;
            for(int j=0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return a;
    }

    static void main() {
        int[] arr = {2,5,1,9,4,10,8};
        sortingBs(arr);
        for(int i:arr){
            System.out.print(i+",");
        }
    }

}
