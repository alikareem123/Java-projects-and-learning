package com.lpa.enumproject;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.FRI;
        System.out.println(weekDay);
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDayOfTheWeek();
            // System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(),
            // weekDay.ordinal());
            // if (weekDay == DayOfTheWeek.FRI) {
            // System.out.println("Found a friday");
            // }
            switchDayOfWeek(weekDay);

        }
        for (Toppings toppings : Toppings.values()) {
            System.out.println(toppings.name() + " : " + toppings.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case THUR -> System.out.println("Thursday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase()
                    + "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDayOfTheWeek() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}