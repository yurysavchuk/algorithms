package com.github.yurysavchuk.arrays.containsduplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    void containsDuplicates() {
        // given:
        int [] nums = new int[] {1,2,3,1};
        var sut = new ContainsDuplicate();

        // when:
        boolean result = sut.containsDuplicate(nums);

        // then:
        assertTrue(result);
    }

    @Test
    void noDuplicatesFound() {
        // given:
        int [] nums = new int[] {1,2,3,4};
        var sut = new ContainsDuplicate();

        // when:
        boolean result = sut.containsDuplicate(nums);

        // then:
        assertFalse(result);
    }

    @Test
    void containsDuplicatesLong() {
        // given:
        int [] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        var sut = new ContainsDuplicate();

        // when:
        boolean result = sut.containsDuplicate(nums);

        // then:
        assertTrue(result);
    }
}