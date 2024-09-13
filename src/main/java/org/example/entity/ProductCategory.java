package org.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductCategory {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long categoryId;
   private String categoryName;
   private String categoryDescription;

   @ManyToOne
   @JoinColumn(name = "parentCategoryId")
   private ProductCategory parentCategory;

   @OneToMany(mappedBy = "parentCategory")
   private List<ProductCategory> subCategories;

   // Getters and setters
}
