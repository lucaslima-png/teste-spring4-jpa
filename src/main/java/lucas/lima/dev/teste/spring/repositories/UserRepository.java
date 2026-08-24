package lucas.lima.dev.teste.spring.repositories;

import lucas.lima.dev.teste.spring.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
