package com.github.yurysavchuk.arrays.besttimetobuysellstocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    @Test
    void vestTimeToBuyAndSellStockFirst() {
        // given:
        int [] prices = new int[] {7,1,5,3,6,4};
        int expectedResult = 7;
        var sut = new BestTimeToBuyAndSellStock();

        // when:
        int result = sut.maxProfit(prices);

        // then:
        assertEquals(expectedResult, result);
    }

    @Test
    void vestTimeToBuyAndSellStockSecond() {
        // given:
        int [] prices = new int[] {1,2,3,4,5};
        int expectedResult = 4;
        var sut = new BestTimeToBuyAndSellStock();

        // when:
        int result = sut.maxProfit(prices);

        // then:
        assertEquals(expectedResult, result);
    }

    @Test
    void vestTimeToBuyAndSellStockNoProfit() {
        // given:
        int [] prices = new int[] {7,6,4,3,1};
        int expectedResult = 0;
        var sut = new BestTimeToBuyAndSellStock();

        // when:
        int result = sut.maxProfit(prices);

        // then:
        assertEquals(expectedResult, result);
    }
}
