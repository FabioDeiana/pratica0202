package com.example.demo;

import com.example.demo.entities.Drink;
import com.example.demo.entities.Pizza;
import com.example.demo.entities.Topping;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test della pizzeria")
public class PizzeriaTest {
    private Topping cheese;
    private Topping tomato;
    private Topping ham;
    private Pizza margherita;
    private Pizza hawaiian;
    private Drink water;

    @BeforeEach
    void setUp() {
        cheese = new Topping("Cheese", 92, 0.69);
        tomato = new Topping("Tomato", 20, 0.00);
        ham = new Topping("Ham", 35, 0.99);

        margherita = new Pizza("Margherita",
                Arrays.asList(tomato, cheese), 1104, 4.99);

        hawaiian = new Pizza("Hawaiian",
                Arrays.asList(tomato, cheese, ham), 1024, 6.49);

        water = new Drink("Water", 0, 1.29);
    }
    @Test
    @DisplayName("1. Test semplice: verifica nome e prezzo pizza")
    void testPizzaAttributes() {
        assertEquals("Margherita", margherita.getName());
        assertEquals(4.99, margherita.getPrice());
    }
}
