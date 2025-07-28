package com.codingrecipe.coffee_oder.service.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterCoffeeRequest {
    private String coffeeName;
    private String coffeePrice;
    private String coffeeData;

    public Coffee toCoffee(Account account) {
        return new Coffee (coffeeName, coffeePrice, coffeeData, account);
    }
}
