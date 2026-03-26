package arrays;

import java.util.HashMap;

public class PrefixSum {
    //[1, -1, 5, -2, 3]
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 1, 1};
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxlength = 0;
        for (int i =0; i< arr.length;i++){
            sum=sum+arr[i];
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if(sum == k){
                maxlength = i + 1;
            }
            if(map.containsKey(sum - k)){
                maxlength = Math.max(maxlength,i-map.get(sum-k));
            }
        }
        System.out.println(maxlength);
    }

}
