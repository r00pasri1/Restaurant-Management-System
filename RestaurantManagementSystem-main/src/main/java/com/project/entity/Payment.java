package com.project.entity;

public class Payment {
    private String paymentMethod;
    private double amount;
    private String date;

    private String time;

    public Payment(String paymentMethod, double amount, String date, String time) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.date = date;
        this.time = time;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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
}
