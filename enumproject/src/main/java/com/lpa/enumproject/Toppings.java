package com.lpa.enumproject;

public enum Toppings {
    MUSTARD,
    CHEADLE,
    TOMATOES,
    PICKLES,
    CHEDDAR; // ";" to be used in case you want to have functions in here.

    public double getPrice() {
        return switch (this) {
            case MUSTARD -> 1.4;
            case CHEDDAR -> 2.1;
            default -> 0.0;
        };
    }
}
