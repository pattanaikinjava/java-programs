package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given with a list of strings. Join the string with the custom delimiter using streams
public class StreamDelimiter
{
    public static List<String> AUTOMOBILE_BRANDS =
             Arrays.asList("Peugeot","Ford","Rollsroyce","BMW","Ferrai","Rangerover","Audi");

    public static void main(String[] args) {
        System.out.println("******* Before delimiter List "+ AUTOMOBILE_BRANDS + " *******");
        System.out.println();
        String resultsInDelimiter = AUTOMOBILE_BRANDS.stream().collect(
                Collectors.joining(":","\"","\"")
        );
        System.out.println("******* After delimiter List "+resultsInDelimiter+" *******");
    }
}
