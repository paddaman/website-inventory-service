package se.website.resource;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.website.domain.Product;

@RestController
@RequestMapping(value = "/admin")
public class InventoryResource {

    @ApiOperation(value = "Get all products from the database.", tags = "Items")
    @GetMapping(value = "/products", produces = "application/json")
    public ResponseEntity<Product> getItems() {
        return new ResponseEntity<>(new Product(1, "Super product!"), HttpStatus.OK);
    }

    @ApiOperation(value = "Get the provided product from database.", tags = "Items")
    @GetMapping(value = "/products/{id}", produces = "application/json")
    public ResponseEntity<Product> getItem(@PathVariable int id) {
        return new ResponseEntity<>(new Product(id, "User chosen product."), HttpStatus.OK);
    }
}
