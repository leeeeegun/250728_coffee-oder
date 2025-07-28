package com.codingrecipe.coffee_oder.service.response;

import com.codingrecipe.coffee_oder.entity.Coffee;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterCoffeeResponse {
    private final Long CoffeeId;
    private final String CoffeeName;
    private final String CoffeePrice;
    private final String CoffeeData;
    private final String registerAccountNickname;

    public RegisterCoffeeResponse from(Coffee coffee) {
        return new RegisterCoffeeResponse(
                coffee.getId(),
                coffee.getName(),
                coffee.getPrice(),
                coffee.getData(),
                coffee.getAccount().getNickname()
        );
    }
}
