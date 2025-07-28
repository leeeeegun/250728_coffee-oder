package com.codingrecipe.account.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    final private AccountRepository accountRepository;

    @Override
    public RegisterAccountResponse register(RegisterAccountRequest request) {
        Account requestAccount = request.toAccount();
        Account savedAccount = accountRepository.save(requestAccount);

        return RegisterAccountRespone.from(savedAccount);
    }
}
