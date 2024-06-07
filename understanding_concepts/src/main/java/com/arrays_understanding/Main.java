package com.arrays_understanding;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello world!");

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);
        printText();

        String[] sArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",", sArray));

        int[] array = {1, 2, 3, 4, 5, 6};
        reverseArray(array);
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    private static void printText(String... textList) {
        for (String tString : textList) {
            System.out.println(tString);
        }
    }
    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by comma: ");
        String input = scanner.nextLine();

        String[] integers = input.split(",");
        int[] values = new int[integers.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(integers[i].trim());
        }

        scanner.close();
        return values;
    }
    private static void reverseArray(int[] array){
        int l = array.length - 1;
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[l - i];
            array[l -i] =  temp;
        }
        System.out.println(Arrays.toString(array));
    }
}