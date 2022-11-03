package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cybage.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
