package arrays;

public class validsubarraysumslidingwindow {

    public static void main(String[] args){
        int[] arr = {1,1,1,1,1};
        int k=2;
        int left = 0;
        int sum =0;
        int count = 0;
        for (int i=0;i<=arr.length-1;i++){
            sum+= arr[i];

            while(sum>k){
                sum = sum - arr[left];
                left++;
            }
            if(sum == k){
                count++;
            }
        }
        System.out.println(count);
    }
}
