package arrays;

public class maximumConsecutiveOnes {

    static void main() {
        int[] a ={1, 1, 0, 0, 1, 1, 1,0,1};


        int num=1;
        System.out.println("there are "+ getConsecutiveNum(a,num)+" "+num+"s in the given array");
    }

    public static int getConsecutiveNum(int[] a, int num){
        int Maxcounter =0;
        int currentCount=0;
        for (int i =0;i<a.length;i++){
            if(a[i]==num){
                currentCount++;
                Maxcounter=  Math.max(Maxcounter,currentCount);
            }else{
                currentCount=0;
            }        }
        return Maxcounter;

    }}
