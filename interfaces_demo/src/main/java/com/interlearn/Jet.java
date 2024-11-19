package com.interlearn;

public class Jet implements Trackable, FlightEnabled {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " is being tracked");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

}
