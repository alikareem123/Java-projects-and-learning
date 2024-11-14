package com.lpa.autoboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = 15;
        System.out.println(boxedInt.getClass().getName());
        int unboxedInt = boxedInt;
        Double getDoubleBoxed = getLiteralDoublePrimitive();

        // example for automatic boxing and unboxing.
        double unboxedDouble = getDoubleObject();
        System.out.println(getDoubleBoxed + unboxedDouble);

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 49;
        System.out.println(Arrays.toString(wrapperArray));
        
        int[] arr = new int[5];
        arr[0] = 19;
        System.out.println(Arrays.toString(arr));
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }
    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }

    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }
}