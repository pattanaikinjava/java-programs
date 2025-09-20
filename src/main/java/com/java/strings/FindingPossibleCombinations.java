package com.java.strings;

import java.util.ArrayList;
import java.util.List;
//Bitmask rule
public class FindingPossibleCombinations
{
    private static final String input = "abcd";
    public static void main(String[] args) {
        //formula
//        double combinations = Math.pow(2,3) -1;
        int combinations = (1 << input.length()) -1;
        System.out.println(combinations);
        List<String> stringCOmbinations = new ArrayList<>();
        for(int i=0; i<combinations; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<input.length(); j++){
                if((i & 1<<j) > 0){
                  sb = sb.append(input.charAt(j));
                }
            }
            stringCOmbinations.add(sb.toString());
        }
        System.out.println(stringCOmbinations);

    }
}
