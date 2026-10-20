package sorting;

public class insertionSort {


    public static int[] getSortedArray(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a.length - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    static void main() {
        int[] arr = {2, 5, 1, 9, 4, 10, 8};
        getSortedArray(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

}


