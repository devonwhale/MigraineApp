package com.example.migraineapp;

/**
 * Created by Sumaia on 28/01/2015.
 */
public class Sleeping {
    private long id, time_to_bed, time_up;
    private int sleep_rating;
    public Sleeping() {
        // Empty Constructor
    }

    // Constructors
    public Sleeping(long time_to_bed, long time_up) {
        this.time_to_bed = time_to_bed;
        this.time_up = time_up;
    }

    // Constructors
    public Sleeping(long time_to_bed, long time_up, int sleep_rating) {
        this.time_to_bed = time_to_bed;
        this.time_up = time_up;
        this.sleep_rating=sleep_rating;
    }

    // Constructors
    public Sleeping(int sleep_rating){
        this.sleep_rating=sleep_rating;
    }


    // Setters
    public void setID (int xID) {
        this.id = xID;
    }

    public void setTimeUp (long time_up) {
        this.time_up = time_up;
    }

    public void setTimeToBed (long time_to_bed) {
        this.time_to_bed = time_to_bed;
    }

    public void setSleepRating (int sleep_rating) {
        this.sleep_rating = sleep_rating;
    }

    // Getters
    public long getID () {
        return id;
    }

    public long getTimeUp () {
        return time_up;
    }

    public long getTimeToBed () {
        return time_to_bed;
    }

    public int getSleepRating () {
        return sleep_rating;
    }

    public String toString() {
        return "Sleeping [ID: " + id + ", Time to bed: " + time_to_bed + ", Time Up: " + time_up + ", Sleep Rating " + sleep_rating  + "]" + "\n";
    }
}
