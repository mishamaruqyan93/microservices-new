package inventoryservice;

import inventoryservice.model.Inventory;
import inventoryservice.repo.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("Redmy I10");
            inventory1.setQuantity(1);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("Redmy Z40");
            inventory2.setQuantity(4);

            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);
        };
    }
}
