package com.codingrecipe.account.controller.request_form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterAccountRequestForm {
    final private String email;
    final private String nickname;

    public RegisterAccountRequest toRegisterAccountRequest() {
        return new RegisterAccountRequest(email, nickname);
    }
}
