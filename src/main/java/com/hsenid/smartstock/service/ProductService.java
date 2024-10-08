package com.hsenid.smartstock.service;

import com.hsenid.smartstock.dto.mapper.CategoryMapper;
import com.hsenid.smartstock.entity.Category;
import com.hsenid.smartstock.entity.Product;
import com.hsenid.smartstock.repository.CategoryRepo;
import com.hsenid.smartstock.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private CategoryMapper categoryMapper;


    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }

    public Product createProduct(Product product) {
        Optional<Category> categoryOpt = categoryRepo.findById(product.getCategoryId());
        if (categoryOpt.isPresent()) {
            return productRepo.save(product);
        }
        throw new RuntimeException("Category not found");
    }

    public Optional<Product> getProductById(String id) {
        return productRepo.findById(id);
    }
}