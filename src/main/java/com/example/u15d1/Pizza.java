package com.example.u15d1;

import java.util.List;

public class Pizza {
    private String name;
    private int Calorie;
    private List<Topping> toppings;
    private double Prezzo;

    public Pizza(String name, int calorie, List<Topping> toppings, double Prezzo) {
        this.name = name;
        Calorie = calorie;
        this.toppings = toppings;
        Prezzo = Prezzo;
    }


    public String name() {
        return name;
    }

    public void AggiungiTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getPrezzo() {
        double totale = Prezzo;
        for (Topping topping : toppings) {
            totale += topping.prezzo();
        }
        return totale;
    }


    public int getCalorie() {
        int totaleCalorie = Calorie;
        for (Topping topping : toppings) {
            totaleCalorie += topping.calorie();
        }
        return totaleCalorie;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + "(" + toppings + ")" + ", Calorie=" + Calorie + ", Prezzo=" + Prezzo + '}';
    }
}
