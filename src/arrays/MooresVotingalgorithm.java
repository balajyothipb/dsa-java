package arrays;

public class MooresVotingalgorithm {
    public static void main (String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        int element = arr[0];
        int count = 0;
        for (int i=0;i<=arr.length-1;i++){
            if(count == 0){
                element=arr[i];
            }
            if(element == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(element);
    }
}
