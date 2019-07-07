package se.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.website.domain.Product;
import se.website.repository.InventoryRepository;

import java.util.List;

/**
 * Created 2019-07-07 by patrikingverud
 */
@Service
public class InventoryService {

    private InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<Product> getProducts() {

        return inventoryRepository.findAll();
    }

    public Product getProduct(Long id) {

        return inventoryRepository.findById(id);
    }

    public Product saveProduct(Product product) {

        return inventoryRepository.save(product);
    }
}
