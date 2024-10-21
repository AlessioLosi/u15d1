package com.example.u15d1;

import java.util.List;

public class Menu {
    List<Pizza> pizze;
    List<Topping> toppings;
    List<Drink> drinks;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Drink> drinks) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public List<Pizza> pizze() {
        return pizze;
    }

    public List<Topping> toppings() {
        return toppings;
    }

    public List<Drink> drinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", drinks=" + drinks +
                '}';
    }
}
