package org.example.service;

import org.example.model.ProductCategory;
import org.example.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

   private final ProductCategoryRepository productCategoryRepository;

   @Autowired
   public ProductCategoryService(ProductCategoryRepository productCategoryRepository) {
      this.productCategoryRepository = productCategoryRepository;
   }

   public ProductCategory saveProductCategory(ProductCategory productCategory) {
      return productCategoryRepository.save(productCategory);
   }

   public List<ProductCategory> getAllProductCategories() {
      return productCategoryRepository.findAll();
   }
}