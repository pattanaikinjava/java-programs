package com.java.strings;

import java.util.HashSet;
import java.util.Set;

//sliding window approach....
public class FindLongestSubstrNonRepetitive
{
    public static void main(String[] args) {
        String input = "abcabcbb";
        int strLen = input.length();
        int maxLength = 0;
        String longSubStr = null;
//      System.out.println(strLen);
        int leftWindow =0;
        int rightWindow =0;
        Set<Character> charSet = new HashSet<>();
        while (rightWindow <strLen) {
           if(!charSet.contains(input.charAt(rightWindow))){
               charSet.add(input.charAt(rightWindow));
               if(rightWindow-leftWindow+1 > maxLength){
                   maxLength = Math.max(maxLength, rightWindow-leftWindow+1);
                   longSubStr = input.substring(leftWindow, rightWindow +1);
               }
               rightWindow ++;
           }
           else{
               charSet.remove(input.charAt(leftWindow));
               leftWindow ++;
           }
        }
        System.out.println(maxLength + " --" + longSubStr);
    }
}
