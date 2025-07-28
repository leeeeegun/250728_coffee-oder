package com.codingrecipe.account.service;

import com.codingrecipe.account.service.request.RegisterAccountRequest;
import com.codingrecipe.account.service.response.RegisterAccountResponse;

public interface AccountService {
    RegisterAccountResponse register(RegisterAccountRequest request);
}
