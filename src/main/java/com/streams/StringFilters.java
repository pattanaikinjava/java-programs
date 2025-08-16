package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// To filter out the strings that starts with numbers
public class StringFilters {
    private static List<String> strNumbers =
            Arrays.asList(
                    "","1Orange",null,"Banana","2Papaya","Grapes","3Pineapple","Cherry","10Mangoes"
            );
    public static void main(String[] args) {
        System.out.println(strNumbers.stream( ).filter(
              obj -> (obj != null) && !(obj.isBlank())
              && Character.isDigit(obj.charAt(0))
      ).collect(
              Collectors.toList()
      ));
    }
}
