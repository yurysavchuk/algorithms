package com.github.yurysavchuk.strings.reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void reverseStringTest1() {
        // given:
        char[] input = new char[] {'h','e','l','l','o'};
        char[] expectedArray = new char[] {'o','l','l','e','h'};
        var sut = new ReverseString();

        // when:
        sut.reverseString(input);

        // then:
        Assertions.assertArrayEquals(expectedArray, input);
    }

    @Test
    void reverseStringTest2() {
        // given:
        char[] input = new char[] {'H','a','n','n','a','h'};
        char[] expectedArray = new char[] {'h','a','n','n','a','H'};
        var sut = new ReverseString();

        // when:
        sut.reverseString(input);

        // then:
        Assertions.assertArrayEquals(expectedArray, input);
    }
}