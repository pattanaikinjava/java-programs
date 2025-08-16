package com.streams;

import com.streams.model.Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingStreams
{
    public static List<Employee> setModelValue(){
        List<Employee> empList = Arrays.asList(
                new Employee(101,"Albert",50000.0d,"Technical analyst"),
                new Employee(106,"Ram",52000.0d,"Technical analyst"),
                new Employee(107,"Shyam",55000.0d,"Technical analyst"),
                new Employee(108,"Jeet",60000.0d,"Technical analyst"),
                new Employee(102,"Rhuoo",100000.0d,"Consultant"),
                new Employee(103,"Jeam",180000.0d,"Senior consultant"),
                new Employee(104,"Robert",150000.0d,"Technical Lead"),
                new Employee(105,"Sam",200000.0d,"Technical Head")
        );
        return empList;
    }
    public static void main(String[] args) {
        //Model class Examples
        List<Employee>employees =  setModelValue();
        //Listing out employees whose salary more than 1,00,000
        /*employees.
                stream().
                filter(
                        emp ->
                                emp.getEmpSalary()>100000
                ).forEach(
                       obj ->
                               System.out.println(obj.getEmpName())
                );*/
        //Listing out employees whose salary more than 50,000 and employees holding technical analyst position
        employees.
                stream().
                filter(
                        emp ->
                                emp.getEmpSalary()>50000 & emp.getEmpDesignation().equals("Technical analyst")
                ).forEach(
                        obj ->
                                System.out.println(obj.getEmpName())
                );
        //listing out employees based on 3rd highest salary...
        Optional<Double> NthHighestSalary =  employees.
                stream().
                map(Employee:: getEmpSalary).
                distinct().
                sorted(Comparator.reverseOrder()).
                skip(3 -1).
                findFirst();

        if(NthHighestSalary.isPresent()){
            System.out.println("3rd Highest salary "+NthHighestSalary.get());
            List<Employee> empWithNthHighest = employees.stream()
                    .filter(e -> e.getEmpSalary().equals(NthHighestSalary.get()))
                    .collect(Collectors.toList());
            System.out.println("Employee details "+empWithNthHighest);
        }

        // Examples
        List<Integer> list = Arrays.asList(11, 9, 33, 40, 15, 26, 70, 20, 19, 10);
        list = list.
            stream().
                    collect(
                            Collectors.toList()
                    );
        System.out.println("Without sorting, list of integers "+list);

        //Sorted in ascending order
        list = list.
            stream().
                   sorted(
                           Comparator.naturalOrder()
                ).collect(
                        Collectors.toList()
                );
        System.out.println("Sorted in ascending order "+list);

        //Sorted in descending order
        list = list.
                   stream().
                          sorted(
                                  Comparator.reverseOrder()
                          ).collect(
                                  Collectors.toList()
                );
        System.out.println("Sorted in descending order "+list);

    }
}
