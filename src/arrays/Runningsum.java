package arrays;

import java.util.Arrays;

public class Runningsum {
    public static void main (String [] args){
        int[] arr = {1,2,3,4,5};
        for (int i = 1;i<=arr.length-1;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        int[] arr2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
    }
}
