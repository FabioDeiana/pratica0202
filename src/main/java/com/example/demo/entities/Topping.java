package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Topping {
    private String name;
    private int calories;
    private double price;
}
