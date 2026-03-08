package com.vishnu.practice;

import java.util.ArrayDeque;
import java.util.Deque;


public class ValidParentheses {

    public boolean isValid(String s) {

        Deque<Character> expectedClosings = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(' -> expectedClosings.push(')');
                case '[' -> expectedClosings.push(']');
                case '{' -> expectedClosings.push('}');
                case ')', ']', '}' -> {
                    if (expectedClosings.isEmpty() || expectedClosings.pop() != ch) {
                        return false;
                    }
                }
                default -> {
                    return false;
                }
            }
        }
        return expectedClosings.isEmpty();
    }
}
