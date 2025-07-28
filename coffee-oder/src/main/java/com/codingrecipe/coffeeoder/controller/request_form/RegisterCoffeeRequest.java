package com.codingrecipe.coffeeoder.controller.request_form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RegisterCoffeeRequest {

    final private String coffeeName;
    final private String coffeePrice;
    final private String coffeeData;

    // RequestForm을 Request로 변환
    public RegisterCoffeeRequest toRegisterCoffeeRequest(){
        return new RegisterCoffeeRequest(coffeeName, coffeePrice, coffeeData);
    }
}
