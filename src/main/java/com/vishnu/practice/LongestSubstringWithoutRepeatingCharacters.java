package com.vishnu.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeenIndexByChar = new HashMap<>();
        int maxWindow = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char currentChar = s.charAt(windowEnd);
            Integer lastSeenIndex = lastSeenIndexByChar.get(currentChar);
            if (lastSeenIndex != null && lastSeenIndex >= windowStart) {
                windowStart = lastSeenIndex + 1;
            }
            lastSeenIndexByChar.put(currentChar, windowEnd);
            maxWindow = Math.max(maxWindow, windowEnd - windowStart + 1);
        }
        return maxWindow;
    }
}