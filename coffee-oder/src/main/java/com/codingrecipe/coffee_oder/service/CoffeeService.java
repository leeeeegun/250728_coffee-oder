package com.codingrecipe.coffee_oder.service;

public interface CoffeeService {
    RegisterCoffeeResponse register(RegisterCoffeeRequest request, Long accountId);
}
