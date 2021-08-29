package com.github.yurysavchuk.strings.longsubstr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void testCase1() {
        // given:
        LongestSubstringWithoutRepeatingCharacters sut = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abcabcbb";

        // when:
        int result = sut.lengthOfLongestSubstring(input);

        // then:
        assertEquals(3, result);
    }
}
