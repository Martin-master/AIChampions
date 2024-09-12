package org.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @CrossOrigin(origins = "http://localhost:3000")
   @GetMapping("/api/hello")
   public String hello() {
      return "Hello from the backend!";
   }
}