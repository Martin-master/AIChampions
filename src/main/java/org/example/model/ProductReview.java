package org.example.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_reviews")
public class ProductReview {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long reviewID;

   @ManyToOne
   @JoinColumn(name="product_id", nullable=false)
   private Product product;

   @ManyToOne
   @JoinColumn(name="user_id", nullable=false)
   private User user;

   private Integer rating;
   private String comment;

   @Column(name = "created_at")
   private LocalDateTime createdAt;

public Long getReviewID() {
    return reviewID;
}

public void setReviewID(Long reviewID) {
    this.reviewID = reviewID;
}

public Product getProduct() {
    return product;
}

public void setProduct(Product product) {
    this.product = product;
}

public User getUser() {
    return user;
}

public void setUser(User user) {
    this.user = user;
}

public Integer getRating() {
    return rating;
}

public void setRating(Integer rating) {
    this.rating = rating;
}

public String getComment() {
    return comment;
}

public void setComment(String comment) {
    this.comment = comment;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}
}