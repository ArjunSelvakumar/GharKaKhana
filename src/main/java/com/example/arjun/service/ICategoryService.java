package com.example.arjun.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.arjun.dto.CategoryDto;
import com.example.arjun.entity.Category;
import com.example.arjun.exception.CategoryAlreadyExistException;
import com.example.arjun.exception.IdAlreadyExistException;
import com.example.arjun.repository.ICategoryRepository;

@Service
public class ICategoryService {
	@Autowired
	ICategoryRepository categoryRepository;

	public Category addCategory(CategoryDto category) throws CategoryAlreadyExistException{
	        if (category == null) {
	            throw new CategoryAlreadyExistException("Category already exist");
	        } else {
	            categoryRepository.save(category);
	        }
		return categoryRepository.save(category);
	}

	@SuppressWarnings("unused")
	public Category updateCategory(CategoryDto category) throws IdAlreadyExistException {
		Optional<Category> container = categoryRepository.findById(category.getId());
		if (category == null) {
			 throw new IdAlreadyExistException("Id already exist");
		}else {
            categoryRepository.save(category);
        }
		if (container.isPresent()) {
			Category result = container.get();
			result.setId(category.getId());
			result.setName(category.getName());
			return categoryRepository.save(result);
		}
		return null;
	}



	public Category removeCategory(int categoryId) {
		Optional<Category> container = categoryRepository.findById(categoryId);
		if (container.isPresent()) {
			Category result = container.get();
			categoryRepository.delete(result);
			return result;
		}
		return null;
	}

	public Category viewCategory(int categoryId) {
		Optional<Category> container = categoryRepository.findById(categoryId);
		if (container.isPresent()) {
			return container.get();
		}
		return null;
	}

	public List<Category> viewAllCategory() {
		
		return categoryRepository.findAll();
		
	}
}
