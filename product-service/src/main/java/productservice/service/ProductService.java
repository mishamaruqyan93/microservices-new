package productservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import productservice.dto.ProductRequest;
import productservice.dto.ProductResponse;
import productservice.model.Product;
import productservice.repo.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;


    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        repository.save(product);
        log.info("Product {} was saved", product.getId());
    }


    public List<ProductResponse> getAll() {
        List<Product> allProduct = repository.findAll();

        return allProduct.stream().map(product -> mapToProductResponse(product))
                .collect(Collectors.toList());
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
