package com.example.u15d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class AppConfig {
    @Bean
    public Topping Cheese() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping Salami() {
        return new Topping("Salami", 0.99, 86);
    }

    @Bean
    public Topping Onion() {
        return new Topping("Onion", 0.69, 22);
    }

    @Bean
    public Topping Pineapple() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    public Topping Ham() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Pizza margheritaPizza() {
        Pizza pizza = new Pizza("Pizza Margherita (tomato, cheese)", 1104, null, 4.99);
        return pizza;
    }

    @Bean
    public Pizza HawaiianPizza() {
        Pizza pizza = new Pizza("Pizza Hawaiiana (tomato, cheese, ham, pineapple)", 1024, new ArrayList<>(), 6.99);

        pizza.AggiungiTopping(Ham());
        pizza.AggiungiTopping(Pineapple());

        return pizza;
    }

    @Bean
    public Pizza SalamiPizza() {
        Pizza pizza = new Pizza("Pizza Salami (tomato, cheese, salami)", 1160, new ArrayList<>(), 5.99);

        pizza.AggiungiTopping(Salami());

        return pizza;
    }

    @Bean
    public Drink Lemonade() {
        return new Drink("Lemonae", 1.29, 128);
    }

    @Bean
    public Drink Acqua() {
        return new Drink("Acqua", 1.29, 0);
    }

    @Bean
    public Drink Vino() {
        return new Drink("Vino", 7.49, 607);
    }

    @Bean
    public Menu menu() {
        return new Menu(
                Arrays.asList(margheritaPizza(), HawaiianPizza(), SalamiPizza()),
                Arrays.asList(Ham(), Cheese(), Pineapple(), Salami(), Onion()),
                Arrays.asList(Lemonade(), Acqua(), Vino())
        );
    }


}
