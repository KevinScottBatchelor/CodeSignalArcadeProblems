package com.InterViewTypeQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Given a string s consisting of small English letters, find and return the first instance of a non-repeating
character in it. If there is no such character, return '_'.

Example

For s = "abacabad", the output should be
solution(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
solution(s) = '_'.

There are no characters in this string that do not repeat.

Input/Output

[execution time limit] 3 seconds (java)

[input] string s

A string that contains only lowercase English letters.

Guaranteed constraints:
1 ≤ s.length ≤ 105.

[output] char

The first non-repeating character in s, or '_' if there are no characters that do not repeat.
*/
public class FirstNotRepeatingCharacter {
    static char solution(String s) {
        char firstNotRepeatingChar = '_';

        //insertion order matters
        //char     //count
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        //iterate thru string as array of chars
        for (char c : s.toCharArray()) {
            //if the map already has a key of the char from str aka "a repeat char"
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                //else add the char as a new key and with a value of 1 for first occurrence in str
            } else {
                map.put(c, 1);
            }
        }
        //now we have linked hashmap with chars inserted in order of occurrence as we went thru str

        //iterate through linked hashmap keyset and find first key with value 1 (aka the first non repeating char)
        for (Map.Entry<Character, Integer> c : map.entrySet()) {

            //if the current key has a value of 1 return the value ('char')
            if (c.getValue() == 1) return c.getKey();

        }
        return firstNotRepeatingChar;
    }
    public static void main (String[] args) {
        String s = "abacabad";
        //expected 'c'
        System.out.println(solution(s));
    }
}
