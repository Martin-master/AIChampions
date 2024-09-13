package org.example.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long productId;
   private String productName;
   private String productDescription;
   private BigDecimal productPrice;
   private String productSKU;
   private BigDecimal productWeight;
   private String productDimensions;
   private String productStatus;
   private LocalDateTime createdAt;
   private LocalDateTime updatedAt;

   @OneToMany(mappedBy = "product")
   private List<ProductImage> productImages;

   @OneToMany(mappedBy = "product")
   private List<ProductReview> productReviews;

   @OneToMany(mappedBy = "product")
   private List<ProductSpecification> productSpecifications;

   @OneToMany(mappedBy = "product")
   private List<Inventory> inventories;

   @OneToMany(mappedBy = "product")
   private List<RelatedProduct> relatedProducts;

   // Getters and setters
}