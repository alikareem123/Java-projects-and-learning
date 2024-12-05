package com.interlearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
    private static void orbit(OrbitEarth flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }

    public static void main(String[] args) {
        inFlight(new Jet());
        orbit(new Satellite());
        // OrbitEarth.log("Testing" +  new Satellite());


        // List<List<String>> listOfLists = Arrays.asList(
        //         Arrays.asList("Reflection", "Collection", "Stream"),
        //         Arrays.asList("Structure", "State", "Flow"),
        //         Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"));
        // Set<String> interMediateResults = new HashSet<>();
        // List<String> result = listOfLists.stream()
        //         .flatMap(List::stream)
        //         .filter(s -> s.startsWith("S"))
        //         .map(String::toUpperCase)
        //         .distinct()
        //         .sorted()
        //         .peek(s -> interMediateResults.add(s))
        //         .collect(Collectors.toList());

        // System.out.println("Intermediate result");
        // interMediateResults.forEach(System.out::println);

        // System.out.println("Final result");
        // result.forEach(System.out::println);
    }
}
