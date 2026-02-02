package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Pizza {
    private String name;
    private List<Topping> toppings;
    private int calories;
    private double price;
}
