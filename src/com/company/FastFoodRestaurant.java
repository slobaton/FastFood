package com.company;

import java.util.ArrayList;
import java.util.List;

public class FastFoodRestaurant {

    public static void main(String[] args) {
        FactoryCombo factory = new FactoryCombo();

        Combo combo1 = factory.getCombo("COMBO1");
        Combo combo2 = factory.getCombo("COMBO2");
        Combo combo3 = factory.getCombo("COMBO3");

        System.out.println("Account combo1: " + combo1.calculateTotal());
        System.out.println("Account combo2: " + combo2.calculateTotal());
        System.out.println("Account combo3: " + combo3.calculateTotal());
    }
}
