package arrays;

public class KadanesAlgorithm {

    public static void main (String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int sum =0;
        int start = 0;
        int arrStart = -1;
        int arrEnd = -1;
        for (int i=0;i<arr.length;i++){
            if(sum == 0){
                start = i;
            }
            sum = sum + arr[i];
            if(sum>max){
                max = Math.max(sum,max);
                arrStart = start;
                arrEnd = i;
            }
            if(sum<0){
                sum =0;
            }

        }
        System.out.println(max);
        System.out.println(arr[arrStart]+" "+arr[arrEnd]);
    }
}
