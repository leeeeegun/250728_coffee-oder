package com.codingrecipe.coffee_oder.service;

import com.codingrecipe.coffee_oder.service.request.RegisterCoffeeRequest;
import com.codingrecipe.coffee_oder.service.response.RegisterCoffeeResponse;

public interface CoffeeService {
    RegisterCoffeeResponse register(RegisterCoffeeRequest request, Long accountId);
}
