package arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main (String[] args){
        int[] arr = {2,3,5,4,1,0,0};
        int index = -1;
        for(int i= arr.length-2 ; i>=0;i--){
            if(arr[i] < arr[i+1]){
                index = i;
                System.out.println(index);
                break;
            }


        }
        if(index == -1){
            int left = 0;
            int right = arr.length-1;
            while ( left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }else {
            for (int i = arr.length - 1; i >= index + 1; i--) {
                if (arr[i] > arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
            int left = index + 1;
            int right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
