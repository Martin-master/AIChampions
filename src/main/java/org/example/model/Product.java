package org.example.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long productID;

   private String productName;
   private String productDescription;
   private Double productPrice;
   private String productSKU;
   private Double productWeight;
   private String productDimensions;
   private String productStatus;

   @Column(name = "created_at")
   private LocalDateTime createdAt;

   @Column(name = "updated_at")
   private LocalDateTime updatedAt;

   public Long getProductID() {
      return productID;
   }

   public void setProductID(Long productID) {
      this.productID = productID;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductDescription() {
      return productDescription;
   }

   public void setProductDescription(String productDescription) {
      this.productDescription = productDescription;
   }

   public Double getProductPrice() {
      return productPrice;
   }

   public void setProductPrice(Double productPrice) {
      this.productPrice = productPrice;
   }

   public String getProductSKU() {
      return productSKU;
   }

   public void setProductSKU(String productSKU) {
      this.productSKU = productSKU;
   }

   public Double getProductWeight() {
      return productWeight;
   }

   public void setProductWeight(Double productWeight) {
      this.productWeight = productWeight;
   }

   public String getProductDimensions() {
      return productDimensions;
   }

   public void setProductDimensions(String productDimensions) {
      this.productDimensions = productDimensions;
   }

   public String getProductStatus() {
      return productStatus;
   }

   public void setProductStatus(String productStatus) {
      this.productStatus = productStatus;
   }

   public LocalDateTime getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
   }

   public LocalDateTime getUpdatedAt() {
      return updatedAt;
   }

   public void setUpdatedAt(LocalDateTime updatedAt) {
      this.updatedAt = updatedAt;
   }
}