package com.codingrecipe.coffee_oder.repository;

import com.codingrecipe.coffee_oder.service.response.RegisterCoffeeResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface CoffeeRepository extends JpaRepository<Book, Long> {

    RegisterCoffeeResponse register();
}
