package org.example.service;

import org.example.model.ProductImage;
import org.example.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageService {

   private final ProductImageRepository productImageRepository;

   @Autowired
   public ProductImageService(ProductImageRepository productImageRepository) {
      this.productImageRepository = productImageRepository;
   }

   public ProductImage saveProductImage(ProductImage productImage) {
      return productImageRepository.save(productImage);
   }

   public List<ProductImage> getAllProductImages() {
      return productImageRepository.findAll();
   }
}