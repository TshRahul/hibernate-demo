package com.stereo.hibernatedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "song")
public class Song {
    @Id
    private int songId;
    private String songName;
    private String singer;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
