package dynamicprogramming;

public class BestTimeToBuyAndSell {
	//If you were only permitted to complete at most one transaction
	//(ie, buy one and sell one share of the stock)If you were on
    public int maxProfit(int[] prices) {
        int max=0;
        int maxSoFar=0;
        for(int i=0; i<prices.length-1;i++){
              maxSoFar=Math.max(0,maxSoFar+=prices[i+1]-prices[i]);
              max=Math.max(maxSoFar,max);
        }
        return max;
    }
}
