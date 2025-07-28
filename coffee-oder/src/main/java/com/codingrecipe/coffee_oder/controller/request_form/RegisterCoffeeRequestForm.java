package com.codingrecipe.coffee_oder.controller.request_form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RegisterCoffeeRequestForm {

    final private String coffeeName;
    final private String coffeePrice;
    final private String coffeeData;

    // RequestForm을 Request로 변환
    public RegisterCoffeeRequestForm toRegisterCoffeeRequest(){
        return new RegisterCoffeeRequestForm(coffeeName, coffeePrice, coffeeData);
    }
}
