package com.example.demo.repository;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void findAllByCategory_id()
    {

    }

    @Test
    void isProduct1Present()
    {
        Category category = new Category(6,"Rasmalai");
        Product product = new Product(60,"Rasmalai",category,65,100,"nice","Bakery.jpeg");
        productRepository.save(product);
        boolean actualResult = productRepository.existsById(60l);
        assertTrue(actualResult==true);

    }
}