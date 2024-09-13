package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

   private final ProductRepository productRepository;

   @Autowired
   public ProductService(ProductRepository productRepository) {
      this.productRepository = productRepository;
   }

   public Product saveProduct(Product product) {
      return productRepository.save(product);
   }

   public List<Product> getAllProducts() {
      return productRepository.findAll();
   }
}