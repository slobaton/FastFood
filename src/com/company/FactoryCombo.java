package com.company;

public class FactoryCombo {
    public Combo getCombo(String combo) {
        if (combo.equalsIgnoreCase("COMBO1")) {
            Combo combo1 = new Combo();
            combo1.setBurger(new CheeseBurger(15));
            combo1.setFried(new ChunkyFries(8));
            combo1.setDrink(new Drink("Coke", 2));
            combo1.setDiscount(5);
            return combo1;
        }

        if (combo.equalsIgnoreCase("COMBO2")) {
            Combo combo2 = new Combo();
            combo2.setBurger(new ChickenBurger(12));
            combo2.setFried(new FriedYucca(9));
            combo2.setDrink(new Drink("Lemonade", 2.5));
            combo2.setDiscount(10);
            return combo2;
        }

        if (combo.equalsIgnoreCase("COMBO3")) {
            Combo combo3 = new Combo();
            combo3.setBurger(new ClassicBurger(10));
            combo3.setFried(new ClassicFries(10));
            combo3.setDrink(new Drink("Strawberry", 5));
            combo3.setDiscount(15);
            return combo3;
        }

        return null;
    }
}
