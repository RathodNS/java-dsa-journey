package arrays;

public class secondLargest {

    static void main() {
        int[] a = {3,2,5,20,95,100,156,23,923};

        System.out.println("second largest number in the array is :"+getSecondLargest(a));
    }

    public static int getSecondLargest(int[] a){
        int first_largest=Integer.MIN_VALUE;
        int second_Largest=Integer.MIN_VALUE;

        for(int i=0;i<=a.length-1;i++){
            if(a[i]>first_largest){
                second_Largest=first_largest;
                first_largest=a[i];
            }

            if(a[i]>second_Largest && a[i]!=first_largest){
                second_Largest=a[i];
            }
        }
        return second_Largest;
    }

}
