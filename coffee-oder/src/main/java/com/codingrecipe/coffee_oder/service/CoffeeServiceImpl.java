package com.codingrecipe.coffee_oder.service;

import com.codingrecipe.coffee_oder.entity.Coffee;
import com.codingrecipe.coffee_oder.repository.CoffeeRepository;
import com.codingrecipe.coffee_oder.service.request.RegisterCoffeeRequest;
import com.codingrecipe.coffee_oder.service.response.RegisterCoffeeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl {

    final private CoffeeRepository coffeeRepository;
    final private AccountRepository accountRepository;

    @Override
    public RegisterCoffeeResponse register(RegisterCoffeeRequest request, Long accountId) {
        Optional<Account> maybeAccount = accountRepository.findById(accountId);
        log.info("잘못된 접근입니다");
        return null;
    }

    Account account = maybeAccount.get();
    Coffee requesteCoffee = request.toCoffee(account);

    Coffee saveCoffee = coffeeRepository.save(requesteCoffee);
    return RegisterCoffeeResponse.from(savedCoffee);
}
