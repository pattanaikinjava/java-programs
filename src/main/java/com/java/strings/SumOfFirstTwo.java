package com.java.strings;

/*
 * You are given with list of numbers. Find the sum of integers value of first 2
 * 87,45,35,74,325,98
 *  //87 + 45*/

import java.util.List;
public class SumOfFirstTwo
{
        public static void main(String[] args) {
            //Immutable List
            List<Integer> numbersList = List.of(87,45,35,74,325,98); //87 + 45
            System.out.println(numbersList.stream().limit(2).mapToInt(Integer::intValue).sum());

            //average of first 3 numbers
            System.out.println(numbersList.stream().limit(3).mapToInt(Integer::intValue).average());
        }

}
