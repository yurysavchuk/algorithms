package com.github.yurysavchuk.sorting.mergesortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge1() {
        // given:
        int [] input1 = new int[] {1,2,3,0,0,0};
        int elementToMerge1 = 3;
        int [] input2 = new int[] {2,5,6};
        int elementToMerge2 = 3;
        int [] expectedArray = new int[] {1,2,2,3,5,6};
        var sut = new MergeSortedArray();

        // when:
        sut.merge(input1, elementToMerge1, input2, elementToMerge2);

        // then:
        assertArrayEquals(expectedArray, input1);
    }

    @Test
    void merge2() {
        // given:
        int [] input1 = new int[] {1};
        int elementToMerge1 = 1;
        int [] input2 = new int[] {};
        int elementToMerge2 = 0;
        int [] expectedArray = new int[] {1};
        var sut = new MergeSortedArray();

        // when:
        sut.merge(input1, elementToMerge1, input2, elementToMerge2);

        // then:
        assertArrayEquals(expectedArray, input1);
    }

    @Test
    void merge3() {
        // given:
        int [] input1 = new int[] {0};
        int elementToMerge1 = 0;
        int [] input2 = new int[] {1};
        int elementToMerge2 = 1;
        int [] expectedArray = new int[] {1};
        var sut = new MergeSortedArray();

        // when:
        sut.merge(input1, elementToMerge1, input2, elementToMerge2);

        // then:
        assertArrayEquals(expectedArray, input1);
    }

    @Test
    void merge4() {
        // given:
        int [] input1 = new int[] {2,0};
        int elementToMerge1 = 1;
        int [] input2 = new int[] {1};
        int elementToMerge2 = 1;
        int [] expectedArray = new int[] {1,2};
        var sut = new MergeSortedArray();

        // when:
        sut.merge(input1, elementToMerge1, input2, elementToMerge2);

        // then:
        assertArrayEquals(expectedArray, input1);
    }

    @Test
    void merge5() {
        // given:
        int [] input1 = new int[] {0,0,3,0,0,0,0,0,0};
        int elementToMerge1 = 3;
        int [] input2 = new int[] {-1,1,1,1,2,3};
        int elementToMerge2 = 6;
        int [] expectedArray = new int[] {-1,0,0,1,1,1,2,3,3};
        var sut = new MergeSortedArray();

        // when:
        sut.merge(input1, elementToMerge1, input2, elementToMerge2);

        // then:
        assertArrayEquals(expectedArray, input1);
    }

}