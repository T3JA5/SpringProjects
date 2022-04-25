package com.pkg.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pkg.springweb.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
