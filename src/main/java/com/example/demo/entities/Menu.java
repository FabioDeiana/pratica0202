package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public void printMenu() {
        System.out.println("===== MENU =====");
        System.out.println("\nPizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println("\nToppings:");
        for (Topping topping : toppings) {
            System.out.println(topping);
        }
        System.out.println("\nDrinks:");
        for (Drink drink : drinks) {
            System.out.println(drink);
        }
    }
}