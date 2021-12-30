package com.github.yurysavchuk.arrays.besttimetobuysellstocks;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    private int calculate(int[] prices, int index) {
        if (index >= prices.length) {
            return 0;
        }
        int max = 0;
        for (int i = index; i < prices.length; i++) {
            int maxProfit = 0;
            for (int j = i  + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    int profit = calculate(prices, j + 1) + prices[j] - prices[i];
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
            if (maxProfit > max) {
                max = maxProfit;
            }
        }
        return max;
    }

}
