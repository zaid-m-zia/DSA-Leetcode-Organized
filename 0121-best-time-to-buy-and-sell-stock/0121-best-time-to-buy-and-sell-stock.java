class Solution {
    public int maxProfit(int[] prices) {

        int minprice = prices[0];
        int maxprofit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Found a cheaper buying price
            if (prices[i] < minprice) {
                minprice = prices[i];
            }

            // Profit if we sell today
            int profit = prices[i] - minprice;

            // Update maximum profit
            if (profit > maxprofit) {
                maxprofit = profit;
            }
        }

        return maxprofit;
    }
}