package com.codingrecipe.coffeeoder.repository;

import com.codingrecipe.coffeeoder.service.response.RegisterCoffeeResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface CoffeeRepository extends JpaRepository<Book, Long> {

    RegisterCoffeeResponse register();
}
