package se.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.website.domain.Product;

import java.util.List;

/**
 * Created 2019-07-07 by patrikingverud
 */
@Repository
public interface InventoryRepository extends JpaRepository<Product, Integer> {

    List<Product> findAll();

    Product findById(Long id);

    @SuppressWarnings("unchecked")
    Product save(Product product);
}
