package com.example.arjun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.arjun.entity.Food;

public interface IFoodRepository extends JpaRepository<Food,String> {

}
