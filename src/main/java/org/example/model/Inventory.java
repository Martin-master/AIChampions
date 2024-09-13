package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long inventoryID;

   @ManyToOne
   @JoinColumn(name="product_id", nullable=false)
   private Product product;

   private Integer stockQuantity;
   private Integer lowStockThreshold;

  public Long getInventoryID() {
    return inventoryID;
}

public void setInventoryID(Long inventoryID) {
    this.inventoryID = inventoryID;
}

public Product getProduct() {
    return product;
}

public void setProduct(Product product) {
    this.product = product;
}

public Integer getStockQuantity() {
    return stockQuantity;
}

public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
}

public Integer getLowStockThreshold() {
    return lowStockThreshold;
}

public void setLowStockThreshold(Integer lowStockThreshold) {
    this.lowStockThreshold = lowStockThreshold;
}
}