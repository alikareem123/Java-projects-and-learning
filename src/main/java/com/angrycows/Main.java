package com.angrycows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class FlattenArray {

    public static List<Object> flatten(Object[] nestedArray) {
        List<Object> flattenedList = new ArrayList<>();
        for (Object element : nestedArray) {
            if (element instanceof Object[]) {
                flattenedList.addAll(flatten((Object[]) element));
            } else {
                flattenedList.add(element);
            }
        }
        return flattenedList;
    }

}

public class Main {
    public static void main(String[] args) {

        Object[] nestedArray = { 1, 2, new Object[] { 3, 4, new Object[] { 5, 6 }, 7, 8 } };
        List<Object> flattendArray = FlattenArray.flatten(nestedArray);
        System.out.println(Arrays.toString(flattendArray.toArray()));
        // int[] stalls = {1, 2, 4, 8, 9};
        // int cows = 3;
        // int result = AgressiveCows.maxMinDistance(stalls, cows);
        // System.out.println(result);

        // int[] books = { 12, 34, 67, 90 };
        // int students = 2;

        // System.out.println("Minimum pages =: " +
        // BookAllocation.allocateMinimumPages(books, students));

        // List<Employee> employees = new ArrayList<>(List.of(
        //         new Employee(1001, "Ralph", 2015),
        //         new Employee(1005, "Carole", 2021),
        //         new Employee(1022, "Jane", 2013),
        //         new Employee(13151, "Laura", 2020),
        //         new Employee(10050, "Jim", 2018)));

        // var comparator = new EmployeeComparator<>();
        // employees.sort(comparator);

        // employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        // for (Employee employee : employees) {
        // System.out.println(employee);
        // }

        // List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
        //         new StoreEmployee(10015, "Meg", 2019, "Target"),
        //         new StoreEmployee(10101, "Bruce", 2021, "Walmart"),
        //         new StoreEmployee(21103, "Tanner", 2018, "Wendys"),
        //         new StoreEmployee(19973, "Daniel", 2015, "Super"),
        //         new StoreEmployee(73311, "Tim", 2017, "Macys")));

        // var comparator = new StoreEmployee().new StoreComparator<>();
        // storeEmployees.sort(comparator);

        // for (StoreEmployee storeEmployee : storeEmployees) {
        //     System.out.println(storeEmployee);
        // }
        // Static nested classes are inherited by subclasses.

    }
}