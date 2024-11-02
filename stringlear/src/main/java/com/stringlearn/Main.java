package com.stringlearn;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {

        GroceryItem ab = new GroceryItem("Chowmein");
        System.out.println(ab.name()); // direct getters for record

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "Produce", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(0, new GroceryItem("Oranges"));
        groceryList.add(new GroceryItem("Cucumbers", "Veggies", 10));
        groceryList.set(1, new GroceryItem("Eggs"));
        groceryList.remove(0);
        System.out.println(groceryList);
        System.out.println(groceryList.get(1));
    }
}