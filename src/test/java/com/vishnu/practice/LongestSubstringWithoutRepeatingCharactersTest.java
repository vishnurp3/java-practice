package com.vishnu.practice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters solution =
            new LongestSubstringWithoutRepeatingCharacters();

    @ParameterizedTest
    @MethodSource("testCases")
    void shouldReturnLengthOfLongestSubstringWithoutRepeatingCharacters(String input, int expected) {
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("a", 1),
                Arguments.of("aa", 1),
                Arguments.of("ab", 2),
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("dvdf", 3),
                Arguments.of("abba", 2),
                Arguments.of("tmmzuxt", 5),
                Arguments.of("anviaj", 5),
                Arguments.of("abcdef", 6),
                Arguments.of("aab", 2),
                Arguments.of("abccdefgh", 6)
        );
    }
}