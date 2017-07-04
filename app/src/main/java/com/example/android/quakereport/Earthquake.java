package com.example.android.quakereport;

/**
 * Created by dobry on 21.06.17.
 */

public class Earthquake {

    // magnitude values
    private double mMag;
    // place
    private String mPlace;
    // time of earthquake occure
    private long mTime;
    // url to website with earthqake info
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location     is the location where the earthquake happened
     * @param time      is the time in milliseconds (from the Epoch) when the
     *                  earthquake happened
     * @param url       is the website URL to find more details about the earthquake
     */
    public Earthquake(Double magnitude, long time, String location, String url) {
        mMag = magnitude;
        mTime = time;
        mPlace = location;
        mUrl = url;
    }

    // Getters and setters
    public double getMag() {
        return mMag;
    }

    public void setMag(double mag) {
        this.mMag = mag;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        this.mTime = time;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        this.mPlace = place;
    }


}
