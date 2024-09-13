package org.example.service;

import org.example.model.ProductReview;
import org.example.repository.ProductReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductReviewService {

   private final ProductReviewRepository productReviewRepository;

   @Autowired
   public ProductReviewService(ProductReviewRepository productReviewRepository) {
      this.productReviewRepository = productReviewRepository;
   }

   public ProductReview saveProductReview(ProductReview productReview) {
      return productReviewRepository.save(productReview);
   }

   public List<ProductReview> getAllProductReviews() {
      return productReviewRepository.findAll();
   }
}