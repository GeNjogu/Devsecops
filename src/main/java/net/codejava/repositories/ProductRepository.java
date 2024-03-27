package net.codejava.repositories;

import net.codejava.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { //crud

}
