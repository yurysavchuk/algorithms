package com.github.yurysavchuk.math.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void FizzBuzzTest1() {
        // given:
        int input = 3;
        var sut = new FizzBuzz();
        List<String> expectedResult = List.of("1","2","Fizz");

        // when:
        List<String> result = sut.fizzBuzz(input);

        // then:
        assertEquals(expectedResult, result);
    }

    @Test
    void FizzBuzzTest2() {
        // given:
        int input = 5;
        var sut = new FizzBuzz();
        List<String> expectedResult = List.of("1","2","Fizz","4","Buzz");

        // when:
        List<String> result = sut.fizzBuzz(input);

        // then:
        assertEquals(expectedResult, result);
    }

    @Test
    void FizzBuzzTest3() {
        // given:
        int input = 15;
        var sut = new FizzBuzz();
        List<String> expectedResult =
                List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

        // when:
        List<String> result = sut.fizzBuzz(input);

        // then:
        assertEquals(expectedResult, result);
    }
}