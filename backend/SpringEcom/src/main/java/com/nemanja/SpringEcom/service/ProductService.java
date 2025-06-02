package com.nemanja.SpringEcom.service;


import com.nemanja.SpringEcom.model.Product;
import com.nemanja.SpringEcom.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


    public Optional<Product> getProductById(int id) {
        return productRepo.findById(id);
    }

}
