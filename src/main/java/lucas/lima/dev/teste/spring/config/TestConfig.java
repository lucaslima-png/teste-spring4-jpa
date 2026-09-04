package lucas.lima.dev.teste.spring.config;

import lucas.lima.dev.teste.spring.entites.Category;
import lucas.lima.dev.teste.spring.entites.Order;
import lucas.lima.dev.teste.spring.entites.Product;
import lucas.lima.dev.teste.spring.entites.User;
import lucas.lima.dev.teste.spring.entities.enums.OrderStatus;
import lucas.lima.dev.teste.spring.repositories.CategoryRepository;
import lucas.lima.dev.teste.spring.repositories.OrderRepository;
import lucas.lima.dev.teste.spring.repositories.ProductRepository;
import lucas.lima.dev.teste.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository pruductRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings",90.5, "Lorem ipsum dolor sit amet, consectetur.",  "");
        Product p2 = new Product(null, "Smart TV",2190.0, "Nulla eu imperdiet purus. Maecenas ante.", "");
        Product p3 = new Product(null, "Macbook Pro",1250.0,"Nam eleifend maximus tortor, at mollis.",  "");
        Product p4 = new Product(null, "PC Gamer",1200.0, "Donec aliquet odio ac rhoncus cursus.",  "");
        Product p5 = new Product(null, "Rails for Dummies",100.99, "Cras fringilla convallis sem vel faucibus.",  "");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        pruductRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.Paid, u1, null);
        Order o2 = new Order(Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.Waiting_Payment, u2, null);
        Order o3 = new Order(Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.Waiting_Payment,  u1, null);


        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
