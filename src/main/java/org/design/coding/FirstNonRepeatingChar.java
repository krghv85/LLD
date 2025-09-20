package org.design.coding;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String [] args) {
        String input1 = "swiss";
        String input2 = "aabbcc";
        char result1 = firstNonRepeatingChar(input1);
        char result2 = firstNonRepeatingChar(input2);

        System.out.println("First non-repeating character: " + result1);
        System.out.println("First non-repeating character: " + result2);

    }

    public static char firstNonRepeatingChar(String str) {

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: countMap.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '$';
    }

}
