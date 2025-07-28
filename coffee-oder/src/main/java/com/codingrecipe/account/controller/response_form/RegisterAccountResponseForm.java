package com.codingrecipe.account.controller.response_form;

import com.codingrecipe.account.controller.request_form.RegisterAccountRequestForm;
import com.codingrecipe.coffee_oder.controller.request_form.RegisterCoffeeRequestForm;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterAccountResponseForm {
    final private String userToken;
    final private String email;
    final private String nickname;

    public static RegisterAccountRequestForm from(
            final RegisterAccountResponse response,
            final String userToken) {

        return new RegisterAccountResponseForm(
                userToken,
                response.getEmail(),
                response.getNickname()
        );
    }
}
