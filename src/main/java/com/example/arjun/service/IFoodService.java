package com.example.arjun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.arjun.entity.Food;
import com.example.arjun.repository.IFoodRepository;


@Service
public class IFoodService {
@Autowired
private IFoodRepository foodRepository;

	public List<Food> getFoodList(){
        List<Food> food;
        food = foodRepository.findAll();
        return food;
    }

    public Food validateFoodInfo(String productId){
        Optional <Food>container=foodRepository.findById(productId);
        if(container.isPresent()) {
        	Food result=container.get();
        	foodRepository.findById(productId);
            return result;
        }
        return null;
    
    }
}
