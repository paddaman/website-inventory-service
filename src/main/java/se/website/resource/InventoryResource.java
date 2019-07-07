package se.website.resource;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.website.domain.Product;
import se.website.service.InventoryService;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class InventoryResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryResource.class);

    private InventoryService inventoryService;

    @Autowired
    public InventoryResource(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @ApiOperation(value = "Get all products from the database.", tags = "Items")
    @GetMapping(value = "/products", produces = "application/json")
    public ResponseEntity<List<Product>> getItems() {
        LOGGER.info("Begin getting all products from database");
        List<Product> products = inventoryService.getProducts();
        LOGGER.info("Done getting all products from database: size {}", products.size());
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @ApiOperation(value = "Get the provided product from database.", tags = "Items")
    @GetMapping(value = "/products/{id}", produces = "application/json")
    public ResponseEntity<Product> getItem(@PathVariable int id) {

        LOGGER.info("Begin getting product from database: id {}", id);
        Product product = inventoryService.getProduct(id);
        LOGGER.info("Done getting product from database: product {}", product);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
