package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BasicsStreams
{
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<String> words = List.of("grapes","pineapple","apple", "banana", "kiwi");
        int number = 12345;

        /* 11. longest string in list */
         String word_name = words.stream().max(
                 Comparator.comparingInt(String::length)
         ).orElse(null);
        System.out.println(word_name);
          //minimum string length
        word_name = words.stream().min(
                Comparator.comparingInt(
                        String::length
                )
        ).orElse("");
        System.out.println(word_name);

        /* 10. Largest and smallest number */
        int N = 2;
        //2nd largest number (in simple)
        int largestNum =  list.stream().sorted(Comparator.reverseOrder()).distinct().skip(N-1).findFirst().orElse(0);
        System.out.println(largestNum);
        //2nd smallest number
            N = 2;
        int smallestNum =  list.stream().sorted().
                       distinct().skip(N-1).findFirst().orElse(0);
        System.out.println(smallestNum);

        /* 9. sum of digits in number */
        String strToNum = String.valueOf(number);
        int sumOfDigits = 0;
         //1st method - using stream character class, there is getNumericValue()
        sumOfDigits = strToNum.chars(). //convert string to char[]
        map( Character::getNumericValue). //convert each char to number
                sum();
        System.out.println(sumOfDigits
        );

        //2nd method : normal method
        for(int i=0; i<strToNum.length(); i++){
            if(Character.isDigit(strToNum.charAt(i))){
              sumOfDigits = sumOfDigits +  Character.getNumericValue(strToNum.charAt(i));
            }
        }
        System.out.println("sum of digits "+ sumOfDigits);

      /* 8. Sort a List of Strings by Their Length */
        words = words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(words);


        /* 7. find first element in list */
         int element = list.stream().findFirst().orElse(0);
          System.out.println(element);
            //find last element
          //1st method...
          element =  list.stream().sorted(
                  Comparator.reverseOrder()
          ).findFirst().orElse(0);
          //2nd method...
          //list.stream().reduce((a,b) -> b).orElse(0);
          System.out.println(element);

        /* 7. squaring the number... */
        List<Integer> listNew = list.stream().map(
                obj -> obj * obj
        ).collect(Collectors.toList());
        System.out.println(listNew);

        /* 6. Check all conditions satisfying */
        boolean allCondition = list.stream().allMatch( n -> n %2 == 0);
        System.out.println(allCondition);

        /* 5.Check element cond in a List */
       boolean isExists =  list.stream().anyMatch( obj -> obj == 3);
        System.out.println(isExists);

        /* 4. Maximum Elements in a List */
       int maxElement =  list.stream().max(Integer:: compare).orElse(0);
       // For minimum element :  list.stream().min(Integer:: compare).orElse(0);
        System.out.println(maxElement);

        /* 3. Average of All Elements in a List */
       double avg =  list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
       System.out.println(avg);

        /* 2. Product of All Elements in a List */
        int product = 1;
        for(int value : list){
            product = product * value ;
        }
        System.out.println(product);
        product = list.stream().reduce(1, (a,b)-> a*b);
        System.out.println(product);

        /* 1.  Sum of All Elements in a List */
        //sum() in streams is used
              //immutable list creation.
        //1st method...
        int sumValue = list.stream().mapToInt(Integer::intValue).sum();

        //2nd method...
        //int sumValue = list.stream().reduce(0, (a,b)-> a+b);
        System.out.println(sumValue);

        int sum= 0;
        for(int value : list){
           sum = sum + value ;
        }
        System.out.println(sum);
    }
}
