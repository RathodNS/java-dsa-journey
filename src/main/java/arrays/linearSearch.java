package arrays;

public class linearSearch {
    static void main() {
        int[] arr = {1, 2, 3, 4,3, 5};
        int target = 3;
        System.out.println(getTargetIndex(arr, target));
    }

    public static int getTargetIndex(int[] a,int targetValue  ){
        int index=0;
      for( int i=0;i<a.length;i++){
          if(a[i]==targetValue){
              index=i;
            break;
          }

      }

      return index;
    }


}
