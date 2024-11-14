package com.lpa.playlistchallenge;

record Song(String title, double duration) {
    @Override
    public final String toString() {
        return title + ": " + duration;
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}