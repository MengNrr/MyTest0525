package com.example.wzh.mytest0525.domain;

import java.io.Serializable;

/**
 * Created by WZH on 2017/5/25.
 */

public class MediaItem implements Serializable {
    private String name;
    private long duration;
    private long size;
    private String data;
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public MediaItem(){}

    public MediaItem(String name, long duration, long size, String data) {
        this.name = name;
        this.duration = duration;
        this.size = size;
        this.data = data;
    }

    public MediaItem(String name, long duration, long size, String data,String artist) {
        this.name = name;
        this.duration = duration;
        this.size = size;
        this.data = data;
        this.artist = artist;
    }


    @Override
    public String toString() {
        return "MediaItem{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", size=" + size +
                ", data='" + data + '\'' +
                '}';
    }
}
