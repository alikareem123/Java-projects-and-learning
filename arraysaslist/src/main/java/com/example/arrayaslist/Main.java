package com.example.arrayaslist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray); // add or remove does'nt work 
        // All arraylist methods not applicable on original list

        originalList.set(0, "one");
        System.out.println("List: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
    }
}