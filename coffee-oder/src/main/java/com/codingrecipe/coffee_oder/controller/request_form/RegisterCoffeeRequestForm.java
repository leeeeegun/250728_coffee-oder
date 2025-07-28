package com.codingrecipe.coffee_oder.controller.request_form;

import com.codingrecipe.coffee_oder.service.request.RegisterCoffeeRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RegisterCoffeeRequestForm {

    final private String coffeeName;
    final private Long coffeePrice;
    final private String coffeeData;

    // RequestForm을 Request로 변환
    public RegisterCoffeeRequest toRegisterCoffeeRequest(){
        return new RegisterCoffeeRequest(coffeeName, coffeePrice, coffeeData);
    }
}
