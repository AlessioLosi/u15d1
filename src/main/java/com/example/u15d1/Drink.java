package com.example.u15d1;

public class Drink {
    private String nome;
    private double prezzo;
    private int calorie;

    public Drink(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public String nome() {
        return nome;
    }

    public double prezzo() {
        return prezzo;
    }


    public int calorie() {
        return calorie;
    }

    @Override
    public String toString() {
        return nome + " (" + prezzo + " EUR, " + calorie + " kcal)";
    }
}
