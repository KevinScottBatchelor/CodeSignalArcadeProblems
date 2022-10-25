package com.codeSignalAracdeProblems;

public class CommonCharacterCount {
    static int solution(String s1, String s2) {
        if (s1.length() == 1 && s2.length() == 1) {
            return s1.equals(s2) ? 1 : 0;
        } else {
            int count = 0;
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            for(int i = 0; i < c1.length; ++i) {
                for(int j = 0; j < c2.length; ++j) {
                    if (c2[j] != ' ' && c1[i] == c2[j]) {
                        ++count;
                        c2[j] = ' ';
                        break;
                    }
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "aaa";
        //should be 1
        System.out.println(solution(s1, s2));
    }
}