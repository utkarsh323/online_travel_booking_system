package com.travel.model;

public class Car {

    private int id;
    private String company;
    private String model;
    private double price;

    // Constructors
    public Car() {}

    public Car(int id, String company, String model, double price) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
