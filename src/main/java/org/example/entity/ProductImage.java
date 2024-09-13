package org.example.entity;

import javax.persistence.*;

@Entity
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;
    private String imagePath;
    private String altText;
    private Integer sortOrder;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    // Getters and setters
}