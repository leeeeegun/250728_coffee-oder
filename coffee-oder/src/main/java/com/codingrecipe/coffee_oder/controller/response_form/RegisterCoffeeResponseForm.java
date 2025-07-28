package com.codingrecipe.coffee_oder.controller.response_form;

import com.codingrecipe.coffee_oder.service.response.RegisterCoffeeResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterCoffeeResponseForm {

    private final Long coffeeId;
    private final String coffeeName;
    private final String coffeePrice;
    private final String coffeeData;
    private final String registerAccountNickname;

    public RegisterCoffeeResponseForm form(RegisterCoffeeResponseForm response) {
        return new RegisterCoffeeResponseForm(
                response.getCoffeeId(),
                response.getCoffeeName(),
                response.getCoffeePrice(),
                response.getCoffeeData(),
                response.getRegisterAccountNickname()
        );
    }
}
