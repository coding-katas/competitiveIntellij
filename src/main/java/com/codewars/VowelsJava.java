package com.codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Vowel count (7)
// https://www.codewars.com/kata/54ff3102c1bad923760001f3

public class VowelsJava {
    private static List<Character> vowels;

    static {
        vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        String voyels="aeiou";
        for (int i=0;i<str.length();i++)
            if (voyels.contains(Character.toString(str.charAt(i))))
                vowelsCount+=1;
        return vowelsCount;
    }

    public static int getCount2(String str) {
        int vowelsCount = 0;

        for(char c : str.toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        return vowelsCount;
    }

    public static int getCount3(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static int getCount4(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    public static int getCount5(String str) {
        int vowelsCount = 0;
        for(int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static int getCount6(String str) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int vowelsCount = 0;
        for(Character ch : str.toCharArray()){
            if(vowels.contains(ch)){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
