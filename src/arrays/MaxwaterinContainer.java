package arrays;

public class MaxwaterinContainer {
    public static void main (String[] args) {
        int[] water = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxwater = 0;
        int left = 0;
        int right = water.length-1;
        while(left < right){
            int width = right - left;
            int currwater = width * Math.min(water[left],water[right]);
            maxwater = Math.max(currwater,maxwater);
            if(water[left] < water[right]){
                left++;
            }else {
                right--;
            }

        }
        System.out.println(maxwater);
    }
}
