package com.hsenid.smartstock.repository;


import com.hsenid.smartstock.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {
}
