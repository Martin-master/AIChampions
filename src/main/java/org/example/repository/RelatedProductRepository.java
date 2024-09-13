package org.example.repository;

import org.example.model.RelatedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatedProductRepository extends JpaRepository<RelatedProduct, Long> {
}