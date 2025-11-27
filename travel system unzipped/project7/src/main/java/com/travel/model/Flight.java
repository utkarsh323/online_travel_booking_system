package com.travel.model;

import java.sql.Date;

public class Flight {
    private int id;
    private String source;
    private String destination;
    private Date date;
    private double price;

    public Flight() {}

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
