// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

import java.util.*;

public class ValidAnagram {

    public boolean isAnagramSorting(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char st[] = s.toCharArray();
        char tt[] = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);
        return Arrays.equals(st, tt);

    }

    public boolean isAnagramArray(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26]; // only lowercase English letters

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "acb";
        ValidAnagram validator = new ValidAnagram();
        boolean x = validator.isAnagramSorting(s, t);
        boolean y = validator.isAnagramArray(s, t);
        System.out.println(x);
        System.out.println(y);

    }
}
