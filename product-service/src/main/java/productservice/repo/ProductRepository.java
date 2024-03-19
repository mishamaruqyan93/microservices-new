package productservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
