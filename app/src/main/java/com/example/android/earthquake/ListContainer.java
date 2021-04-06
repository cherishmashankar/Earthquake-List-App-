package com.example.android.earthquake;

public class ListContainer {
    private double magnitude;
    private String place;
    private long date;
    private String url;

    public String getUrl() {
        return url;
    }



    public ListContainer(double magnitude, String place, long date, String url) {
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
        this.url = url;
    }

    public ListContainer(double magnitude, String place, long date) {
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getPlace() {
        return place;
    }

    public long getDate() {
        return date;
    }


}
