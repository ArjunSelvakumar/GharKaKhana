package com.example.arjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.arjun.entity.Food;
import com.example.arjun.service.IFoodService;


@RestController
@CrossOrigin
public class IFoodController {
@Autowired
private IFoodService foodService;
	 @RequestMapping(value = "/menu")
	    public List<Food> getMenu(Model model) {
	        List<Food> foodItems ;
	        foodItems = foodService.getFoodList();
	        return foodItems;
	    }
}
