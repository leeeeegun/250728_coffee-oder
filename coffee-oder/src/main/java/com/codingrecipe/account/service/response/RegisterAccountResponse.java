package com.codingrecipe.account.service.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterAccountResponse {
    final private String accountId;
    final private String email;
    final private String nickname;

    public RegisterAccountResponse from(final Account account) {
        return new RegisterAccountResponse(
                account.getId(),
                account.getEmail(),
                account.getNickname()
        );
    }
}

