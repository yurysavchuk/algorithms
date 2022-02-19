package com.github.yurysavchuk.dynamic.climbingstairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs1() {
        // given:
        var sut = new ClimbingStairs();
        int input = 2;
        int expectedCombination = 2;

        // when:
        var result = sut.climbStairs(input);

        // then:
        assertEquals(expectedCombination, result);
    }

    @Test
    void climbStairs2() {
        // given:
        var sut = new ClimbingStairs();
        int input = 3;
        int expectedCombination = 3;

        // when:
        var result = sut.climbStairs(input);

        // then:
        assertEquals(expectedCombination, result);
    }
}