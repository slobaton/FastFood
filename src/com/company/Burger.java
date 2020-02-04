package com.company;

public class Burger {
    private String wrapper;
    private double cost;

    public Burger(double cost) {
        this.cost = cost;
    }

    public String getWrapper() {
        return wrapper;
    }

    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
