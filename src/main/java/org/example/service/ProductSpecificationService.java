package org.example.service;

import org.example.model.ProductSpecification;
import org.example.repository.ProductSpecificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSpecificationService {

   private final ProductSpecificationRepository productSpecificationRepository;

   @Autowired
   public ProductSpecificationService(ProductSpecificationRepository productSpecificationRepository) {
      this.productSpecificationRepository = productSpecificationRepository;
   }

   public ProductSpecification saveProductSpecification(ProductSpecification productSpecification) {
      return productSpecificationRepository.save(productSpecification);
   }

   public List<ProductSpecification> getAllProductSpecifications() {
      return productSpecificationRepository.findAll();
   }
}