class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        int profit = 0;

        while(left < right && right < prices.length) {
        profit = prices[right] - prices[left];
        if(profit <= 0) {
            left = right;
            right++;
        } else {
            right++;
        }
        maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
