package com.codingrecipe.coffee_oder.service.response;

import com.codingrecipe.coffee_oder.entity.Coffee;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterCoffeeResponse {
    private final Long CoffeeId;
    private final String CoffeeName;
    private final Long CoffeePrice;
    private final String CoffeeData;
    private final String registerAccountNickname;

    public static RegisterCoffeeResponse from(final Coffee coffee) {
        return new RegisterCoffeeResponse(
                coffee.getId(),
                coffee.getCoffeeName(),
                coffee.getCoffeePrice(),
                coffee.getCoffeeData(),
                coffee.getAccount().getNickname()
        );
    }
}
