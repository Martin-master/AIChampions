package org.example;

import org.example.entity.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class HelloController {
   @CrossOrigin(origins = "http://localhost:3000")
   @GetMapping("/api/hello")
   public String hello() {
      return "Hello from the backend!";
   }

   @Autowired
   private ProductService productService;

   @PostMapping("api/products")
   public Product createProduct(@RequestBody Product product) {
      return productService.createProduct(product);
   }
}