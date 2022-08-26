package com.medicare.we.products.repo;

import com.medicare.we.products.entity.Products;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductsRepo extends MongoRepository<Products, String> {

}
