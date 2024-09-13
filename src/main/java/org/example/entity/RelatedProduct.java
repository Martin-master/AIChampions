package org.example.entity;

import javax.persistence.*;

@Entity
public class RelatedProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relatedId;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "relatedProductId")
    private Product relatedProduct;

    // Getters and setters
}