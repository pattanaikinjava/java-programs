package com.java.strings;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Leetcode Problem: sort the characters by frequency.
  You are given with a string s. Return the array of unique characters, sorted by highest to
  lowest occuring characters.
  output[] = {'e','r','t'};
         //e - 2
         //r -1
         //t -1
*/
public class SortedStringOccurence {
    public static void main(String[] args) {
        String input = "tree";
        List<Character> listSortedChars = getFrequencyCharactersFromOccurence(input);
        System.out.println(listSortedChars);
    }
    public static List<Character> getFrequencyCharactersFromOccurence(String Input){
        char to_characters[] =Input.toCharArray();
        Map<Character,Integer> occurenceOfCharacters = new HashMap<>();
        for(var to_char : to_characters){
             occurenceOfCharacters.put(to_char, occurenceOfCharacters.getOrDefault(to_char,0)+1);
        }
        System.out.println("occurence of each charcaters :"+occurenceOfCharacters);
        List<Character> listOfSorted = new ArrayList<>(occurenceOfCharacters.keySet());
        listOfSorted.sort((c1,c2) ->{
                    if(occurenceOfCharacters.get(c1) == occurenceOfCharacters.get(c2))
                        return c1.compareTo(c2);
                    else
                        return occurenceOfCharacters.get(c2).compareTo(occurenceOfCharacters.get(c1));
                }

        );
        return listOfSorted;
    }
}