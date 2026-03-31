package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeIntervals {

   public static void main (String[] args){
       int[][] intervals = {
               {1,4},
               {2,3},
               {5,7},
               {6,8}
       };
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int i =0; i<intervals.length;i++){
               updatemap(map,intervals[i]);
       }
       System.out.println(map);
   }

    private static void updatemap(HashMap<Integer, Integer> map, int[] arr) {
       boolean update = false;
       if(!map.isEmpty()) {
           for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               if (arr[0] <= entry.getValue()){
                   map.put(entry.getKey(),arr[1]> entry.getValue() ? arr[1] : entry.getValue());
                   update = true;
               }
           }

       }
       if (!update){
           map.put(arr[0],arr[1]);
       }
    }
}
