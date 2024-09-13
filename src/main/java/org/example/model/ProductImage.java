package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "product_images")
public class ProductImage {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long imageID;

   @ManyToOne
   @JoinColumn(name="product_id", nullable=false)
   private Product product;

   private String imagePath;
   private String altText;
   private Integer sortOrder;

   public Long getImageID() {
    return imageID;
}

public void setImageID(Long imageID) {
    this.imageID = imageID;
}

public Product getProduct() {
    return product;
}

public void setProduct(Product product) {
    this.product = product;
}

public String getImagePath() {
    return imagePath;
}

public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
}

public String getAltText() {
    return altText;
}

public void setAltText(String altText) {
    this.altText = altText;
}

public Integer getSortOrder() {
    return sortOrder;
}

public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
}
}