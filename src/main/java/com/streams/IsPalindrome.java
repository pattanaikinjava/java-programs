package com.streams;

import java.util.stream.IntStream;

//To check given string is palindrome without string reversal
public class IsPalindrome{
    public static String GIVEN_STR = "racecar";
    public static void main(String[] args) {
      boolean checkPalindrome = IntStream.range(0,
              GIVEN_STR.length()/2).
              allMatch(
                      input ->
                              GIVEN_STR.charAt(input)
                                      ==
                              GIVEN_STR.charAt(
                                       GIVEN_STR.length() -1-input)
              );

        System.out.println("Given string Palindrome "+checkPalindrome);
    }
}
