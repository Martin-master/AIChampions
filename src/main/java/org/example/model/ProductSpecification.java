package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "product_specifications")
public class ProductSpecification {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long specificationID;

   @ManyToOne
   @JoinColumn(name="product_id", nullable=false)
   private Product product;

   private String attributeName;
   private String attributeValue;

public Long getSpecificationID() {
    return specificationID;
}

public void setSpecificationID(Long specificationID) {
    this.specificationID = specificationID;
}

public Product getProduct() {
    return product;
}

public void setProduct(Product product) {
    this.product = product;
}

public String getAttributeName() {
    return attributeName;
}

public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
}

public String getAttributeValue() {
    return attributeValue;
}

public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
}
}