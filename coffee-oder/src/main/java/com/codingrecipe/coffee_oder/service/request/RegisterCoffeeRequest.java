package com.codingrecipe.coffee_oder.service.request;

import com.codingrecipe.account.entity.Account;
import com.codingrecipe.coffee_oder.entity.Coffee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterCoffeeRequest {
    private String coffeeName;
    private Long coffeePrice;
    private String coffeeData;

    public RegisterCoffeeRequest(String coffeeName, Long coffeePrice, String coffeeData) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeData = coffeeData;
    }

    public Coffee toCoffee(Account account) {
        return new Coffee (coffeeName, coffeePrice, coffeeData, account);
    }
}
