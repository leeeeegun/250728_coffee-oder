package com.codingrecipe.coffee_oder.controller.response_form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterCoffeeResponseForm {

    private final Long coffeeId;
    private final String coffeeName;
    private final String coffeePrice;
    private final String coffeeData;

    public RegisterCoffeeResponseForm form (RegisterCoffeeResponseForm response) {
        return new RegisterCoffeeResponseForm(
                response.getCoffeeId(),
                response.getCoffeeName(),
                response.getCoffeePrice(),
                response.getCoffeeData()
        );
    }
}
