package com.codingrecipe.coffee_oder.entity;

import com.codingrecipe.account.entity.Account;
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
    private Long coffeePrice;
    private String coffeeData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    public Coffee(String coffeeName, Long coffeePrice, String coffeeData) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeData = coffeeData;
    }

    public Coffee(String coffeeName, Long coffeePrice, String coffeeData, Account account) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeData = coffeeData;
        this.account = account;
    }
}
