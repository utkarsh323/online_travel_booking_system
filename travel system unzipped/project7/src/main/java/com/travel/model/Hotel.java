package com.travel.model;

public class Hotel {

    private int id;
    private String name;
    private String location;
    private double price;

    // Constructors
    public Hotel() { }

    public Hotel(int id, String name, String location, double price) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public double getPrice() { return price; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }
    public void setPrice(double price) { this.price = price; }
}
