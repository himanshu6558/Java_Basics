package Array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] num = {5,6,3,7,2,7,3,2,8};
        System.out.println("Max Number:"+returnMaxNum(num));
        System.out.println("Min Number:"+returnMinNum(num));
    }

    static int returnMaxNum(int[] num){
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }

    static int returnMinNum(int[] num){
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]<min){
                min = num[i];
            }
        }

        return min;
    }
}
