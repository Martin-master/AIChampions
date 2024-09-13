
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Entity
public class Product {

   @Id
   private int ProductID;
   private String ProductName;
   private String ProductDescription;
   private double ProductPrice;
   private String ProductSKU;
   private double ProductWeight;
   private String ProductDimensions;
   private String ProductStatus;
   private Timestamp CreatedAt;
   private Timestamp UpdatedAt;
   private Long id;

   // Getters and Setters
   public int getProductID() {
      return ProductID;
   }

   public void setProductID(int productID) {
      ProductID = productID;
   }

   public String getProductName() {
      return ProductName;
   }

   public void setProductName(String productName) {
      ProductName = productName;
   }

   public String getProductDescription() {
      return ProductDescription;
   }

   public void setProductDescription(String productDescription) {
      ProductDescription = productDescription;
   }

   public double getProductPrice() {
      return ProductPrice;
   }

   public void setProductPrice(double productPrice) {
      ProductPrice = productPrice;
   }

   public String getProductSKU() {
      return ProductSKU;
   }

   public void setProductSKU(String productSKU) {
      ProductSKU = productSKU;
   }

   public double getProductWeight() {
      return ProductWeight;
   }

   public void setProductWeight(double productWeight) {
      ProductWeight = productWeight;
   }

   public String getProductDimensions() {
      return ProductDimensions;
   }

   public void setProductDimensions(String productDimensions) {
      ProductDimensions = productDimensions;
   }

   public String getProductStatus() {
      return ProductStatus;
   }

   public void setProductStatus(String productStatus) {
      ProductStatus = productStatus;
   }

   public Timestamp getCreatedAt() {
      return CreatedAt;
   }

   public void setCreatedAt(Timestamp createdAt) {
      CreatedAt = createdAt;
   }

   public Timestamp getUpdatedAt() {
      return UpdatedAt;
   }

   public void setUpdatedAt(Timestamp updatedAt) {
      UpdatedAt = updatedAt;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return id;
   }
}