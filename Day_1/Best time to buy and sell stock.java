// 121. Best Time to Buy and Sell Stock

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



public class Solution {
    public int maxProfit(int[] nums) {
        int buyingPrice = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<nums.length; i++) {
            if(buyingPrice >  nums[i]) {
                buyingPrice = nums[i];
            } else {
                int profit = nums[i] - buyingPrice;
                max = Math.max(max, profit);
            }
        }
        return max;
    }

} 