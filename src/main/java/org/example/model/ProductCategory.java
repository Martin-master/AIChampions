package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "product_categories")
public class ProductCategory {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long categoryID;

   private String categoryName;
   private String categoryDescription;

   @ManyToOne
   @JoinColumn(name="parent_category_id", nullable=true)
   private ProductCategory parentCategory;

   public Long getCategoryID() {
    return categoryID;
}

public void setCategoryID(Long categoryID) {
    this.categoryID = categoryID;
}

public String getCategoryName() {
    return categoryName;
}

public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
}

public String getCategoryDescription() {
    return categoryDescription;
}

public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
}

public ProductCategory getParentCategory() {
    return parentCategory;
}

public void setParentCategory(ProductCategory parentCategory) {
    this.parentCategory = parentCategory;
}
}