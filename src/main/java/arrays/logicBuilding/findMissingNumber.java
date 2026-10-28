package arrays.logicBuilding;

public class findMissingNumber {

    static void main() {

        int[] a = {0, 1, 2,4};

        System.out.println("missing Element is:"+getMissingNumber(a));

        System.out.println("missing Element is:"+getMissingNumberOptimized(a));

    }


    // TS--> o(n) and space complexity o(n)
    public static int getMissingNumber(int[] a){

        boolean[] temp = new boolean[a.length+1];

        for(int i =0;i<a.length;i++){
            temp[a[i]]=true;
        }

        int missingElement=-1;
        for(int j =1;j<temp.length;j++){
            if(temp[j]==false){
                missingElement=j;
            }
        }

        return missingElement;
    }

// TS--> o(n) and space-complexity-->o(1)
    public static int getMissingNumberOptimized(int[] a){
        int n = a.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num: a){
            actualSum+=num;
        }

        return expectedSum-actualSum;
    }
}
