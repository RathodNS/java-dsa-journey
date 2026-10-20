package arrays;

public class largestElement {

    public static void main(String[] args){

        int[] a={3,5,100,2,9,5,1,85,67,92,0};
        System.out.println("largetst number in the given array is:"+getLargest(a));
    }


    public static int getLargest(int[] a){
        int largest = 0;
        for(int i =0;i<a.length-1;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        return largest;
    }

}
