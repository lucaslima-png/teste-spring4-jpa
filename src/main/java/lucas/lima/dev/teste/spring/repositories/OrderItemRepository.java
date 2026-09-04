package lucas.lima.dev.teste.spring.repositories;

import lucas.lima.dev.teste.spring.entites.OrderItem;
import lucas.lima.dev.teste.spring.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
