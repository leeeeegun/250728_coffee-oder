package com.codingrecipe.coffee_oder.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String coffeeName;
    private String coffeePrice;
    private String coffeeData;

    public Coffee(String coffeeName, String coffeePrice, String coffeeData) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeData = coffeeData;
    }
}
