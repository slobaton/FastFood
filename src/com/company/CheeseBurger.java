package com.company;

public class CheeseBurger extends Burger {

    public CheeseBurger(double cost) {
        super(cost);
    }

    @Override
    public String toString() {
        return "CheeseBurger\n " + String.format("Cost: " + this.getCost()) ;
    }
}
