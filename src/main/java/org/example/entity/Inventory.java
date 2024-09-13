package org.example.entity;

import javax.persistence.*;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;
    private Integer stockQuantity;
    private Integer lowStockThreshold;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    // Getters and setters
}