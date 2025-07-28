package com.codingrecipe.account.service;

import com.codingrecipe.account.entity.Account;
import com.codingrecipe.account.repository.AccountRepository;
import com.codingrecipe.account.service.request.RegisterAccountRequest;
import com.codingrecipe.account.service.response.RegisterAccountResponse;
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

        return RegisterAccountResponse.from(savedAccount);
    }
}
