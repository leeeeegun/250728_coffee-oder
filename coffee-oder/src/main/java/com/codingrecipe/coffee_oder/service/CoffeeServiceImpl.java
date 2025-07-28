package com.codingrecipe.coffee_oder.service;

import com.codingrecipe.account.entity.Account;
import com.codingrecipe.account.repository.AccountRepository;
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
public class CoffeeServiceImpl implements CoffeeService {

    final private CoffeeRepository coffeeRepository;
    final private AccountRepository accountRepository;

    @Override
    public RegisterCoffeeResponse register(RegisterCoffeeRequest request, Long accountId) {
        Optional<Account> maybeAccount = accountRepository.findById(accountId);

        if (maybeAccount.isPresent()) {
            log.info("잘못된 접근입니다");
            return null;
        }

        Account account = maybeAccount.get();
        Coffee requestedCoffee = request.toCoffee(account);

        Coffee savedCoffee = coffeeRepository.save(requestedCoffee);
        return RegisterCoffeeResponse.from(savedCoffee);
    }
}
