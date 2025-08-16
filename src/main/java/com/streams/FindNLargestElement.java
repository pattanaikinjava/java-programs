package com.streams;

import java.util.Arrays;
import java.util.Comparator;

//Given with array, to find Nth largest element from an array
public class FindNLargestElement {

    public static int[] GIVEN_ARRAY = {12,4,3,1,9,657};

    public static void main(String[] args) {
      //considering n =3 for finding nth largest element of array
        int N = 3;
             Arrays.stream(
                GIVEN_ARRAY
              ). // converts primitive array int[] to IntStream
              boxed(). // converts IntStream to Stream<Integer> to use .collect Collectors and .sorted Comparators
              sorted(  // sorting the elements in ascending order
                Comparator.naturalOrder()
              ).
              skip( //skiping the first i-1 elements so that next element is i-th element
                N -1
              ).
              findFirst(). //picks the first remaining element from stream
              ifPresent( // prints the result if exists
                System.out::println
              );
    }
}
