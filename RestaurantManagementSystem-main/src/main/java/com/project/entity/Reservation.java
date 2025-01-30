package com.project.entity;

public class Reservation {
    private String date;
    private String time;
    private int numberOfGuests;
    private String specialRequests;

    public Reservation(String date,String time, int numberOfGuests, String specialRequests) {
        this.date = date;
        this.time = time;
        this.numberOfGuests = numberOfGuests;
        this.specialRequests = specialRequests;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }
}
