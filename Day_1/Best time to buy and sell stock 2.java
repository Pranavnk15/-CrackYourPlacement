
// 122. Best Time to Buy and Sell Stock II

// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

// Find and return the maximum profit you can achieve.







class Solution {
    public int maxProfit(int[] prices) {
        //memoization
        int[][] dp = new int[prices.length][2];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, 1, prices, dp);
    }

    public static int solve(int ind, int buy, int[] prices, int[][] dp) {
        if(ind == prices.length) {
            return 0 ;
        }
        if(dp[ind][buy] != -1) return dp[ind][buy];
        int profit = 0;
        if(buy == 1) {
            profit = Math.max(-prices[ind]+solve(ind+1, 0, prices, dp), 0 + solve(ind+1, 1, prices, dp));
        } else {
            profit = Math.max(prices[ind]+solve(ind+1, 1, prices, dp), 0 + solve(ind+1, 0, prices, dp));
        }
        return dp[ind][buy] = profit;
    }
}
