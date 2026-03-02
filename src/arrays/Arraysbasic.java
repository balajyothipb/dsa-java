package arrays;

import java.util.Arrays;

public class Arraysbasic {

    public static void main (String [] args){
        int[] arr = {8,9,3,4,2,1};
        int max = arr[0];
        int min = arr[0];
        for(int i : arr){
            if(i<min){
                min =i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("max : "+max+"min :"+min);

    }
}
