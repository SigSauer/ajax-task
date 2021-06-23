package main.java.com.sigsauer.ajax_task;

import java.util.*;

public class Task {

    public int addTwoDigits(int n) {
        return n / 10 + n % 10;
    }

    public int largestNumber(int n) {
        return (int) (Math.pow(10, n) - 1);
    }

    public char firstNotRepeatingCharacter(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(chars.containsKey(c)) {
                chars.replace(c,chars.get(c)+1);
            }else chars.put(c, 1);
        }
            for (char c: chars.keySet()) {
                if(chars.get(c) == 1) return c;
            }
            return '_';

    }


}
