package org.example.valid_palindrome_125;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("0p"));
        System.out.println(isPalindrome("hello"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[a-zA-Z0-9]", "");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - (1 + i))) {
                return false;
            }
        }
        return true;
    }

}
