package com.arraylistchallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void options() {
        System.out.println("Available actions:\r\n" + //
                "0 - to shutdown\r\n" + //
                "1 - to add item(s) to list (comma delimited list)\r\n" + //
                "2 - to remove any items (comma delimited list)\r\n" + //
                "Enter a number for which action you want to do");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> groceryList = new ArrayList<>();
        do {
            options();
            System.out.println("Ener what you want to do");
            int value = reader.nextInt();
            reader.nextLine();
            if (value == 1) {
                System.out.println("Enter item(s) to add (comma delimited):");
                String readInput = reader.nextLine();
                String[] inputItems = readInput.split(",");
                for (String item : inputItems) {
                    item = item.trim();
                    if (groceryList.contains(item) && !groceryList.isEmpty()) {
                        System.out.println("The item " + item + " is already present");
                    } else {
                        groceryList.add(item);
                    }
                }
                groceryList.sort(Comparator.naturalOrder());
                System.out.println(groceryList);

            } else if (value == 2) {
                System.out.println("Enter item(s) to remove (comma delimited):");
                String readInput = reader.nextLine();
                String[] inputItems = readInput.split(",");
                for (String item : inputItems) {
                    item = item.trim();
                    if (groceryList.contains(item)) {
                        groceryList.remove(item);
                    } else {
                        System.out.println("Item " + item + " not found in the list.");
                    }
                }
                groceryList.sort(Comparator.naturalOrder());
                System.out.println(groceryList);
            } else if (value == 0) {
                System.out.println("Shutting down....");
                break;
            } else {
                System.out.println("Invalid option. Please try again");
            }

        } while (true);
        reader.close();
    }
}