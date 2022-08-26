package com.medicare.we.controller;

import java.util.List;
import java.util.Optional;

import com.medicare.we.products.entity.Products;
import com.medicare.we.products.repo.ProductsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200/")
@RestController
public class ProductController {
	@Autowired
	ProductsRepo prodRepo;

	@GetMapping("/products")
	public List<Products> getProducts() {
		System.out.println("inside prodrepo------" + prodRepo.findAll());
		return prodRepo.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Optional<Products> getProductById(@PathVariable("id") String id) {
		System.out.println("inside user by id------" + prodRepo.findById(id));
		return  prodRepo.findById(id);

	}

	//update method for the user
	@PutMapping("/product")
	public Products updateProductById(@RequestBody Products product) {
		System.out.println("inside user Put map/save------" + prodRepo.save(product));
		return prodRepo.save(product);

	}

	//Delete method
	@DeleteMapping("/product/{id}")
	private  void deleteUser(@PathVariable("id") String id)
	{

		prodRepo.deleteById(id);
	}

	


}
