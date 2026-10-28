package arrays.logicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDuplicates {

    static void main() {
        int[] a ={-2, 2, 4, 4, 4, 4, 5, 5,7,7,8};

        int uniqueArray=getUniqueArray(a);

        System.out.println("unique Elements are:"+uniqueArray);
    }

    public static int getUniqueArray(int[] a){
        if(a.length==1){
            return 1;
        }

        int uniqueElementsCount=1;

        for (int i=0;i<=a.length-2;i++){

            if(a[i]!=a[i+1]){
                uniqueElementsCount++;
            }

        }



        return uniqueElementsCount;
    }
}
