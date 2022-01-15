package com.github.yurysavchuk.arrays.rotatearray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    @Test
    void arrayRotatedSuccessfully1() {
        // given:
        int rotationLevel = 3;
        int [] input = new int[] {1,2,3,4,5,6,7};
        int [] expectedResult = new int[] {5,6,7,1,2,3,4};

        var sut = new RotateArray();

        // when:
        sut.rotate(input, rotationLevel);

        // then:
        Assertions.assertArrayEquals(expectedResult, input);
    }

    @Test
    void arrayRotatedSuccessfully2() {
        // given:
        int rotationLevel = 2;
        int [] input = new int[] {-1,-100,3,99};
        int [] expectedResult = new int[] {3,99,-1,-100};

        var sut = new RotateArray();

        // when:
        sut.rotate(input, rotationLevel);

        // then:
        Assertions.assertArrayEquals(expectedResult, input);
    }
}
