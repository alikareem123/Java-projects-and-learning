package com.stringlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = { "apples", "bananas", "milk", "eggs" };
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        // list.add("null"); Immutable class List

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("Milk", "Eggs", "Bread"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        if (groceries.contains("Milk")) {
            System.out.println("Milk is present");
        }
        groceries.add("Yogurt");
        System.out.println("first = " + groceries.indexOf("Yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("Yogurt"));

        System.out.println(groceries);
        groceries.remove("1");
        System.out.println(groceries);
        groceries.remove("Yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("milk", "Eggs", "Bread"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println("Empty List is " + groceries.isEmpty());
        System.out.println();

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("eggs", "pickles"));
        System.out.println("Arrays as list are " + groceries);

        System.out.println();
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
