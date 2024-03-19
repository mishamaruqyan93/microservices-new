package productservice;//package productservice;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.MongoDBContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import productservice.dto.ProductRequest;
//import productservice.repo.ProductRepository;
//
//import java.math.BigDecimal;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@Testcontainers
//@SpringBootTest
//@AutoConfigureMockMvc
//class ProductServiceApplicationTests {
//
//    @Container
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo");
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//
//    @DynamicPropertySource
//    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//        dynamicPropertyRegistry.add("spring.data.mongo.url", mongoDBContainer::getReplicaSetUrl);
//    }
//
//
//    @Test
//    void should_create_product() throws Exception {
//        ProductRequest productRequest = getProductRequest();
//        String request = objectMapper.writeValueAsString(productRequest);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(request))
//                .andExpect(status().isCreated());
//
//
//        Assertions.assertEquals(1,productRepository.findAll().size());
//    }
//
//    private ProductRequest getProductRequest() {
//        return ProductRequest.builder()
//                .name("IPhone 13")
//                .description("Mobile")
//                .price(BigDecimal.valueOf(1200))
//                .build();
//    }
//
//}
