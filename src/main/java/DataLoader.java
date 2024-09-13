import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

   @Autowired
   private ProductRepository productRepository;

   @Override
   public void run(String... args) throws Exception {
      Product product1 = new Product();
      product1.setProductName("Product 1");
      product1.setProductDescription("Description for Product 1");
      product1.setProductPrice(10.0);
      product1.setProductSKU("SKU001");
      product1.setProductWeight(1.0);
      product1.setProductDimensions("10x10x10");
      product1.setProductStatus("Available");
      product1.setCreatedAt(new Timestamp(System.currentTimeMillis()));
      product1.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

      Product product2 = new Product();
      product2.setProductName("Product 2");
      product2.setProductDescription("Description for Product 2");
      product2.setProductPrice(20.0);
      product2.setProductSKU("SKU002");
      product2.setProductWeight(2.0);
      product2.setProductDimensions("20x20x20");
      product2.setProductStatus("Available");
      product2.setCreatedAt(new Timestamp(System.currentTimeMillis()));
      product2.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

      productRepository.saveAll(Arrays.asList(product1, product2));
   }
}