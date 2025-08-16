package com.program.basics;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//Given with 2 arrays. To find the common element from both arrays.
public class FindCommonInArrays
{
    public static void main(String[] args) {
        //1st array
        int[] arr1 = {1,12,31,64,2,4,45};
        //2nd array
        int[] arr2 = {33,44,45,64,12,2,27};

        /* considering here 2 sets */
        Set<Integer> integerSet = new HashSet(); // considering the set for faster lookup
        for(int e : arr1){
            integerSet.add(e);
        }

        Set<Integer> commons = new HashSet(); // considering the set to identify the common elements
        for(int a: arr2){
            if(integerSet.contains(a)){
                commons.add(a);
            }
        }
        // listing out the commons in descending order
        System.out.println("Common Elements :"+commons.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
