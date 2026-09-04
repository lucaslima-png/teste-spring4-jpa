package lucas.lima.dev.teste.spring.repositories;

import lucas.lima.dev.teste.spring.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
