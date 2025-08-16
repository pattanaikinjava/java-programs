package com.streams;

import java.util.*;
import java.util.stream.Collectors;

// To check if the list of numbers contain any prime numbers
public class CheckPrimeNumberList {
    private static List<Integer> listNumbers = Arrays.asList(4,54,2,6,15,16);
    public static void main(String[] args) {
        boolean containsPrime = listNumbers.stream().anyMatch(
                CheckPrimeNumberList ::primeCheck
        ) ;
        System.out.println("LIST contains prime number "+ containsPrime);
    }
    public static Map<Integer,Boolean>  getPrimes(){
      Map<Integer,Boolean> primeSets =  new HashMap();
        for(int num : listNumbers){
               primeSets.put(num,primeCheck(num));
        }
        return primeSets;
    }
     public static boolean primeCheck(int Number) {
        if(Number <= 1)
            return false;
        else{
            for(int i =2; i<Math.sqrt(Number); i++){
                if(Number % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
