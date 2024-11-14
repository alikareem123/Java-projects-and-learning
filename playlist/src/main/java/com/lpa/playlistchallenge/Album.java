package com.lpa.playlistchallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String name) {
        for (var song : songs) {
            if (song.getTitle().equalsIgnoreCase(name)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int n = songs.size();
        if (trackNumber < 1 || trackNumber > n) {
            return false;
        }
        playList.add(songs.get(trackNumber - 1));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        var res = findSong(title);
        if (res != null) {
            playList.add(res);
            return true;
        } else {
            return false;
        }
    }
}
