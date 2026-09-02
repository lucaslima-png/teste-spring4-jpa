package lucas.lima.dev.teste.spring.repositories;

import lucas.lima.dev.teste.spring.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
