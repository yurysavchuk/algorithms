package com.github.yurysavchuk.arrays.removeduplfromsortarr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicatesFromSortedArraySuccessfullyFirst() {
        // given:
        int [] array = new int[] {1,1,2};
        int [] expectedArray = new int[] {1, 2, };
        int expectedResult = 2;
        var sut = new RemoveDuplicatesFromSortedArray();

        // when:
        int result = sut.removeDuplicatesFromSortedArray(array);

        // then:
        assertEquals(expectedResult, result);
    }

    @Test
    void removeDuplicatesFromSortedArraySuccessfullySecond() {
        // given:
        int [] array = new int[] {0,0,1,1,1,2,2,3,3,4};
        int [] expectedArray = new int[] {0,1,2,3,4};
        int expectedResult = 5;
        var sut = new RemoveDuplicatesFromSortedArray();

        // when:
        int result = sut.removeDuplicatesFromSortedArray(array);

        // then:
        assertEquals(expectedResult, result);
    }
}
