package arrays;
//Find the maximum loss you could incur by making the worst possible trade
// in the given array of prices.
// Example: Input: int[] prices = {100, 180, 260, 310, 40, 535, 695, 30};
// Output: Maximum possible loss: -665
public class maximumloss {

    public static void main (String[] args){
        int[] prices = {100, 180, 260, 310, 695, 535, 40, 30};

        int maxloss = 0;
        int maximum = prices[0];
        int minimum = prices[0];
        int maxprofit = 0;

        for(int i =0; i<prices.length;i++){
            maximum = Math.max(prices[i],maximum);
            minimum = Math.min ( prices[i],minimum);
            maxloss = Math.min(prices[i] - maximum, maxloss);
            maxprofit = Math.max(prices[i] - minimum, maxprofit);

        }
        System.out.println("maximumloss : " + maxloss);
        System.out.print("maxprofit : " + maxprofit);
    }
}
