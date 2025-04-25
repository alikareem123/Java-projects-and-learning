package com.angrycows;

public class Main {
    public static void main(String[] args) {
        // int[] stalls = {1, 2, 4, 8, 9};
        // int cows = 3;
        // int result = AgressiveCows.maxMinDistance(stalls, cows);
        // System.out.println(result);

        int[] books = { 12, 34, 67, 90 };
        int students = 2;

        System.out.println("Minimum pages =: " + BookAllocation.allocateMinimumPages(books, students));
    }
}