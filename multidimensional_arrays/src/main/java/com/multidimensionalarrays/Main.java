package com.multidimensionalarrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[][] arrays = new int[5][5];
        // for (int i = 0; i < arrays.length; i++) {
        //     var inner = arrays[i];
        //     for (int j = 0; j < inner.length; j++) {
        //         arrays[i][j] = (j + 1) * (10 + i);
        //     }
        // }
        // for (var outer : arrays) {
        //     for (var inner : outer) {
        //         System.out.print(inner + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(Arrays.deepToString(arrays));
        Object[] anyArray = new Object[3];
        anyArray[0] = new String[] { "a", "b", "c" };
        anyArray[1] = new String[][] {
                { "1", "2", "3" },
                { "4", "5", "6" },
                { "7", "8", "9" }
        };
        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type= " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }

}