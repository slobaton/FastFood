package com.company;

public class Combo {
    private Drink drink;
    private Burger burger;
    private Fried fried;
    private double discount;
    private String name;

    public Combo(){}


    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Fried getFried() {
        return fried;
    }

    public void setFried(Fried fried) {
        this.fried = fried;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateTotal() {
        double total = drink.getCost() + burger.getCost() + fried.getCost();
        return total - total * this.discount / 100;
    }
}
