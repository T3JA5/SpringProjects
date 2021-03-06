package com.pkg.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pkg.springweb.entities.Product;
import com.pkg.springweb.repos.ProductRepo;

@RestController
public class ProductRestController {

	@Autowired
	ProductRepo repo;
	
	@RequestMapping(value = "/products/", method=RequestMethod.GET)
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/products/{id}", method=RequestMethod.GET)
	public Product getProductById(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@RequestMapping(value = "/products/", method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product p) {
		return repo.save(p);
	}
	
	@RequestMapping(value = "/products/", method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product p) {
		return repo.save(p);
	}
	
	@RequestMapping(value = "/products/{id}", method=RequestMethod.DELETE)
	public void deleteProductById(@PathVariable("id") int id) {
		repo.deleteById(id);
	}
}
