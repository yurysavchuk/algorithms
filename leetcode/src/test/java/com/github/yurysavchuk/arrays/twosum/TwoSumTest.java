package com.github.yurysavchuk.arrays.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    @Test
    void twoSumFirst() {
        // given:
        TwoSum twoSum = new TwoSum();
        int [] nums = { 2,7,11,15 };
        int target = 9;

        // when:
        int [] result = twoSum.twoSum(nums, target);

        // then:
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void twoSumSecond() {
        // given:
        TwoSum twoSum = new TwoSum();
        int [] nums = { 3,2,4 };
        int target = 6;

        // when:
        int [] result = twoSum.twoSum(nums, target);

        // then:
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void twoSumThird() {
        // given:
        TwoSum twoSum = new TwoSum();
        int [] nums = { 3,3 };
        int target = 6;

        // when:
        int [] result = twoSum.twoSum(nums, target);

        // then:
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}
