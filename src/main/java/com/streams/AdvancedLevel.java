package com.streams;

import com.streams.model.Employee;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedLevel
{
    public static void main(String[] args) {
        /* 1. Group a List of Strings by Their Length */
        List<String> words = List.of("apple", "banana","Persimmon", "kiwi","pineapple","grapes");
        Map<Integer, List<String>> strGroupedByLength =
                words.stream().collect(
                        Collectors.groupingBy(
                                String::length
                        )
                );
        System.out.println(strGroupedByLength);

        /* 2. Group list of objects by specific attribute */
          List<Employee> list =  SortingStreams.modelDTO();
          Map<String,List<Employee>> mapOfObjs = list.stream().collect(
                  Collectors.groupingBy(
                          Employee::getEmpDesignation
                  )
          );
          System.out.println(mapOfObjs);

          /* 3. Count the Occurrences of Each Element in a List */
        List<String> words1 = List.of("apple", "banana", "apple", "orange");
        Map<Object, Long> map1 = words1.stream().collect(
                Collectors.groupingBy(

                        a->a,Collectors.counting()

                )
        );
        System.out.println(map1);

        /* 4. Find 3rd highest salary from list of Objects. */
        int N =3;
        Optional<Employee> higheshtSalaryList =
                list.stream().distinct().sorted(Comparator.comparingDouble(Employee::getEmpSalary)).
                        skip(N-1).findFirst();
          higheshtSalaryList.stream().forEach(
                  obj -> System.out.println("Employee Id:" +obj.getEmpId() + ", Employee Name: "+ obj.getEmpName())
          );
//        System.out.println(higheshtSalaryList);

        /* 5. Partition a List of Integers into Even and Odd Numbers */
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> partitonedNumbers = numbers.stream().collect(
           Collectors.partitioningBy(
                   obj -> (obj * 6) % 2 == 0
//                   obj -> obj %2 == 0
           )
        );
        System.out.println(partitonedNumbers);

        /* 6.  Merge Two Lists into a Single List (UNION and INTERSECTION) */
        List<Integer> list1 = List.of(1, 2, 3,4);
        List<Integer> list2 = List.of(4, 5, 6,2);
        List<Integer> mergedList =
                Stream.concat(
                        list1.stream(),
                        list2.stream()
                ).
                 sorted().collect(
                         Collectors.toList()
                        );
        System.out.println(mergedList);//list allows duplicates to store the values.

        // To remove the duplicates, store only unique values...
        mergedList =  Stream.concat(
                         list1.stream(), list2.stream()
                      ).
                        distinct().collect(Collectors.toList());
        System.out.println(mergedList);

        //To find common elements from both lists.
        List<Integer> commons = list1.stream().filter(
                list2::contains
        ).collect(Collectors.toList());
        System.out.println(commons);

        /* 7. Map iteration */
        //iterator on maps are possible because map store key-value in pairs. Its look likely
        //table. Single elements inserting into map is not possible.

        Map<String,String> courses = new HashMap<>();
        courses.put("Ram","Course_1");
        courses.put("Shyam","Course_2");
        courses.put("PR","Course_2");
        courses.put("Dubey","Course_1");
        courses.put("Pappy","Course_3");

        //belonging to course_1 only , filter out the list of names
        List<String> courseList = courses.entrySet().stream().filter(entry ->"Course_1".
                   equals(entry.getValue())).
                map(obj -> obj.getKey()).collect(
                Collectors.toList()
        );
        System.out.println(courseList);

        //belonging to course_1 only
         courses = courses.entrySet().stream().filter(
                 obj -> obj.getValue().equals("Course_1")
         ).collect(
                 Collectors.toMap(
                      obj -> obj.getKey(),
                         n -> n.getValue()
                 )
                 /*
                 Collectors.toMap(
                      Map.Entry :: getKey,
                      Map.Entry :: getValue
                 )
                 */
         );
        System.out.println(courses );

        /* 8. Count occurences of each string...*/
        List<String> occurencelst = List.of("apple", "banana", "apple", "orange");
        Map<String, Long> maptoList = occurencelst.stream().collect(
                Collectors.groupingBy(
                    obj -> obj,    Collectors.counting()
                )
        );
        System.out.println(maptoList);

        /* 9. Occurence of each character... */
        String input = "hello";
       Map<Character,Long> charOccurenc =
               input.chars().mapToObj( OBJ -> (char)OBJ).collect( Collectors.groupingBy( c->c,Collectors.counting()));
        System.out.println(charOccurenc);

        /* 10. Count the Occurrences of Each Word in a String */
        String input_New = "hello world hello";
        Map<String,Long> elementOccur =
        Arrays.stream(input_New.split(" ")).collect(
                Collectors.groupingBy(
                        element -> element, Collectors.counting()
                )
        );
        System.out.println(elementOccur);

        /* 11. Count the Occurrences of Each Digit in a String */
        String inputStr = "hello 123 world 456";
        String inputArr[] = inputStr.split(" ");
        Map<Integer,Long> occurence = new LinkedHashMap<>();
        List<Integer> nubers = new ArrayList<>();
        for(String element: inputArr){
           try{
              int number = Integer.parseInt(element);
               nubers.add(number);
           }
           catch(Exception e){
               continue;
           }
        }
        System.out.println(nubers);
        for(Integer a : nubers){
            String element = String.valueOf(a);
            for(int i=0; i<element.length(); i++){
                occurence.put(Character.getNumericValue(element.charAt(i)), occurence.getOrDefault(element.charAt(i),0l)+1);
            }
        }
        System.out.println(occurence);
       for(Map.Entry<Integer,Long> each: occurence.entrySet()){
          String output =  each.getKey() + " occurs for "+ each.getValue() + " time.";
          System.out.println(output);
       }
    }
}
