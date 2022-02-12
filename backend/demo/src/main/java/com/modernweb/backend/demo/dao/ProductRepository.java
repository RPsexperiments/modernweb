package com.modernweb.backend.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.modernweb.backend.demo.entity.Product;

@CrossOrigin("http://localhost:8080")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
