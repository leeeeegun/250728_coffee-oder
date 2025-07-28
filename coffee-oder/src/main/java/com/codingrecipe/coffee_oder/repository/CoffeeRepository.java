package com.codingrecipe.coffee_oder.repository;

import com.codingrecipe.coffee_oder.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

//    RegisterCoffeeResponse register();
}
