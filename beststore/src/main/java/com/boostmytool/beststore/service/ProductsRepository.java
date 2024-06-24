package com.boostmytool.beststore.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.beststore.models.Product;



public interface ProductsRepository extends JpaRepository<Product, Integer>{

}

