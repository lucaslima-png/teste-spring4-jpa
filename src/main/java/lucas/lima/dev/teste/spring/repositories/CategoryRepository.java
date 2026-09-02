package lucas.lima.dev.teste.spring.repositories;

import lucas.lima.dev.teste.spring.entites.Category;
import lucas.lima.dev.teste.spring.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
