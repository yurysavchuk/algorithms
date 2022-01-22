package com.github.yurysavchuk.arrays.singlenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    @Test
    void test1() {
        // given:
        int [] nums = new int[] {2,2,1};
        var sut = new SingleNumber();

        // when:
        int result = sut.singleNumber(nums);

        // then:
        assertEquals(1, result);
    }

    @Test
    void test2() {
        // given:
        int [] nums = new int[] {4,1,2,1,2};
        var sut = new SingleNumber();

        // when:
        int result = sut.singleNumber(nums);

        // then:
        assertEquals(4, result);
    }

    @Test
    void test3() {
        // given:
        int [] nums = new int[] {1};
        var sut = new SingleNumber();

        // when:
        int result = sut.singleNumber(nums);

        // then:
        assertEquals(1, result);
    }
}