package com.github.yurysavchuk.twosum;

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
}
