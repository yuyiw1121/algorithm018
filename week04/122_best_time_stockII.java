class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int valley = prices[0];
        int peak = prices[0];
        int i = 0;
        int total = prices.length - 1;

        while(i < total) {
            while(i < total && prices[i] >= prices[i+1]) i++; // find valleys
            valley = prices[i];

            while(i < total && prices[i] <= prices[i+1]) i++; // find peaks
            peak = prices[i];

            maxProfit += peak - valley;
        }

        return maxProfit;
    }
}