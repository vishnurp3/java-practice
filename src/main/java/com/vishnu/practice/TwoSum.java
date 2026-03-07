package com.vishnu.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            Integer complementIndex = indexByValue.get(complement);
            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            }

            indexByValue.put(current, i);
        }

        throw new IllegalArgumentException("No two sum solution exists");
    }
}
