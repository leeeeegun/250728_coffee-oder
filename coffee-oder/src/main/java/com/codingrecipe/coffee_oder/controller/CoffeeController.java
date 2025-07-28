package com.codingrecipe.coffee_oder.controller;


import com.codingrecipe.coffee_oder.controller.request_form.RegisterCoffeeRequestForm;
import com.codingrecipe.coffee_oder.controller.response_form.RegisterCoffeeResponseForm;
import com.codingrecipe.coffee_oder.service.CoffeeService;
import com.codingrecipe.coffee_oder.service.request.RegisterCoffeeRequest;
import com.codingrecipe.coffee_oder.service.response.RegisterCoffeeResponse;
import com.codingrecipe.redis_cache.RedisCacheService;
import jakarta.servlet.ServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeService coffeeService;
    private final RedisCacheService redisCacheService;

    // 커피 등록
    // 요청 URI -> /coffee/register
    // 인증 헤더 -> @RequestHeader
    // 요청 정보 -> @RequestBody

    @PostMapping("/register")
    public RegisterCoffeeResponseForm registerCoffee(
            @RequestHeader("Authorization") String authorizationHeader,
            @RequestBody RegisterCoffeeRequestForm requestForm) {

        String userToken = authorizationHeader.startsWith("Bearer ") ?
                authorizationHeader.substring("Bearer ".length()) : authorizationHeader;

        Long accountId = redisCacheService.getValueByKey(userToken, Long.class);

        // 핵심: accountId가 null이면 Unauthorized 에러를 던져야 합니다.
        if (accountId == null) {
            log.warn("유효하지 않거나 만료된 인증 토큰입니다: {}", userToken);
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "유효하지 않거나 만료된 인증 토큰입니다.");
        }

        // accountId가 null이 아닌 경우에만 이 아래 코드가 실행됩니다.
        RegisterCoffeeRequest request = requestForm.toRegisterCoffeeRequest();
        RegisterCoffeeResponse response = coffeeService.register(request, accountId);

        return RegisterCoffeeResponseForm.from(response);
    }
}
