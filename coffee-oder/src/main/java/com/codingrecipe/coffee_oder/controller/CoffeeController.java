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
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/coffee/register")
    public RegisterCoffeeResponseForm registerCoffee(
            @RequestHeader("Authorization") String authorizationHeader,
            @RequestBody RegisterCoffeeRequestForm requestForm) {

        // 인증 정보 체크 ("bearer 뗴어내기")
        String userToken = authorizationHeader.replace("Bearer" , " ").trim();
        Long accountId = redisCacheService.getValueByKey(userToken, Long.class);

        RegisterCoffeeRequest request = requestForm.toRegisterCoffeeRequest();
        RegisterCoffeeResponse response = coffeeService.register(request, accountId);

        return RegisterCoffeeResponseForm.from(response);
    }
}
