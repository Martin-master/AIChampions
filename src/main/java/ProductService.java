import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

   @Autowired
   private ProductRepository productRepository;

   public List<Product> getAllProducts() {
      return productRepository.findAll();
   }

   public Product getProductById(int id) {
      return productRepository.findById(id).orElse(null);
   }

   public Product createProduct(Product product) {
      return productRepository.save(product);
   }

   public Product updateProduct(int id, Product product) {
      Product existingProduct = productRepository.findById(id).orElse(null);
      if (existingProduct != null) {
         existingProduct.setProductName(product.getProductName());
         existingProduct.setProductDescription(product.getProductDescription());
         existingProduct.setProductPrice(product.getProductPrice());
         existingProduct.setProductSKU(product.getProductSKU());
         existingProduct.setProductWeight(product.getProductWeight());
         existingProduct.setProductDimensions(product.getProductDimensions());
         existingProduct.setProductStatus(product.getProductStatus());
         existingProduct.setUpdatedAt(product.getUpdatedAt());
         return productRepository.save(existingProduct);
      }
      return null;
   }

   public void deleteProduct(int id) {
      productRepository.deleteById(id);
   }
}