package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "related_products")
public class RelatedProduct {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long relatedID;

   @ManyToOne
   @JoinColumn(name="product_id", nullable=false)
   private Product product;

   @ManyToOne
   @JoinColumn(name="related_product_id", nullable=false)
   private Product relatedProduct;

public Long getRelatedID() {
    return relatedID;
}

public void setRelatedID(Long relatedID) {
    this.relatedID = relatedID;
}

public Product getProduct() {
    return product;
}

public void setProduct(Product product) {
    this.product = product;
}

public Product getRelatedProduct() {
    return relatedProduct;
}

public void setRelatedProduct(Product relatedProduct) {
    this.relatedProduct = relatedProduct;
}
}