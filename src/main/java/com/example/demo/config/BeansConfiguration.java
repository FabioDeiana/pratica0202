package com.example.demo.config;

import com.example.demo.entities.Drink;
import com.example.demo.entities.Pizza;
import com.example.demo.entities.Topping;
import com.example.demo.entities.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfiguration {
    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }
    @Bean
    public Topping tomato() {
        return new Topping("Tomato", 20, 0.00);
    }
    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }
    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", Arrays.asList(tomato(), cheese()), 1104, 4.99);
    }
    @Bean
    public Pizza hawaiianPizza() {
        return new Pizza("Hawaiian Pizza", Arrays.asList(tomato(), cheese(), ham(), pineapple()), 1024, 6.49);
    }

    @Bean
    public Pizza salamiPizza() {
        return new Pizza("Salami Pizza", Arrays.asList(tomato(), cheese(), salami()), 1160, 5.99);
    }
    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine (0.75l, 13%)", 607, 7.49);
    }
    @Bean
    public Menu menu() {
        return new Menu(
                Arrays.asList(margherita(), hawaiianPizza(), salamiPizza()),
                Arrays.asList(cheese(), ham(), onions(), pineapple(), salami(), tomato()),
                Arrays.asList(lemonade(), water(), wine())
        );
    }
}
