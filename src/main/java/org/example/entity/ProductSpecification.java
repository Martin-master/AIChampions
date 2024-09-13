package org.example.entity;

import javax.persistence.*;

@Entity
public class ProductSpecification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specificationId;
    private String attributeName;
    private String attributeValue;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    // Getters and setters
}
