package com.codingrecipe.coffee_oder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.codingrecipe.coffee_oder.entity", "com.codingrecipe.account.entity"})
@EnableJpaRepositories(basePackages = {"com.codingrecipe.coffee_oder.repository", "com.codingrecipe.account.repository"})
@ComponentScan(basePackages = {"com.codingrecipe.coffee_oder", "com.codingrecipe.redis_cache", "com.codingrecipe.account"}) // 이 부분 추가!
public class CoffeeOderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeOderApplication.class, args);
    }
}