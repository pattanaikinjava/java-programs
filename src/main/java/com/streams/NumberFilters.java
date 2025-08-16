package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// To list out numbers that starts with '1'
public class NumberFilters {
    private static List<Integer> listNumbers = Arrays.asList(123,null,null,345,765,1876,90,100);
    public static void main(String[] args) {
        System.out.println(listNumbers.stream().filter(
          obj -> obj != null && String.valueOf(obj).startsWith("1")).
          collect(Collectors.toList()
        ));
    }
}
