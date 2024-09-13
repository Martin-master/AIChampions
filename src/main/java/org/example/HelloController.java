package org.example;

import org.example.model.Product;
import org.example.model.User;
import org.example.service.ProductService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HelloController {
   @Autowired
   UserService userService;
   @Autowired
   ProductService productService;

   @CrossOrigin(origins = "http://localhost:3000")
   @GetMapping("/api/hello")
   public String hello() {
      return "Hello from the backend!";
   }
   @CrossOrigin(origins = "http://localhost:3000")
   @PostMapping("/api/create_user")
   public User createUser(@RequestBody User user) {
      user.setCreatedAt(LocalDateTime.now());
      return userService.saveUser(user);
   }
   @CrossOrigin(origins = "http://localhost:3000")
   @GetMapping("/api/users")
   public List<User> getUsers() {
      return userService.getAllUsers();
   }

   @CrossOrigin(origins = "http://localhost:3000")
   @PostMapping("/api/create_product")
   public Product createProduct(@RequestBody Product product) {
      product.setCreatedAt(LocalDateTime.now());
      product.setUpdatedAt(LocalDateTime.now());
      return productService.saveProduct(product);
   }
   @CrossOrigin(origins = "http://localhost:3000")
   @GetMapping("/api/products")
   public List<Product> getProducts() {
      return productService.getAllProducts();
   }
}
