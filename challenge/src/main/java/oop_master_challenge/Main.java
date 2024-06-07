package oop_master_challenge;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("CHICKEN", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        // MealOrder secondMeal  = new MealOrder("turkey", "7-up", "chili");
        // secondMeal.addBurgerToppings("LETTUCE","CHEESE", "MAYO");
        // secondMeal.setDrinkSize("SMALL");
        // secondMeal.printItemizedList();

        // MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        // deluxeMeal.addBurgerToppings("AVOCADO", "CHICKEN", "LETTUCE", "CHEESE", "MAYO");
        // deluxeMeal.setDrinkSize("SMALL");
        // deluxeMeal.printItemizedList();
        // Object[] objectArray = new Object[3];
        // objectArray[0] = "Hello";
        // objectArray[1] = new StringBuilder("World");
        // int[] array = new int[]{1, 2, 3};
        // Object objectArra = array;
        // if(objectArra instanceof int[]) {
        //     System.out.println("YEAH");
        // }
        int[] array = getRandomArray(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] secondArray = new int[5];
        Arrays.fill(secondArray, 5);

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println("-".repeat(40));
        System.out.println(Arrays.toString(sortedDesc(fourthArray)));
    }

    private static int[] sortedDesc(int [] array){
        boolean flag = true;
        while (flag) {
            flag = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] < array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
}