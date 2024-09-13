package org.example.service;

import org.example.model.RelatedProduct;
import org.example.repository.RelatedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatedProductService {

   private final RelatedProductRepository relatedProductRepository;

   @Autowired
   public RelatedProductService(RelatedProductRepository relatedProductRepository) {
      this.relatedProductRepository = relatedProductRepository;
   }

   public RelatedProduct saveRelatedProduct(RelatedProduct relatedProduct) {
      return relatedProductRepository.save(relatedProduct);
   }

   public List<RelatedProduct> getAllRelatedProducts() {
      return relatedProductRepository.findAll();
   }
}