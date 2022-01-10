package com.example.Springdrinks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springdrinks.domain.Drink;

public interface DrinkRepo extends JpaRepository<Drink, Long>{

}