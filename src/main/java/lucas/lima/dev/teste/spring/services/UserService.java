package lucas.lima.dev.teste.spring.services;

import lucas.lima.dev.teste.spring.entites.User;
import lucas.lima.dev.teste.spring.repositories.UserRepository;
import lucas.lima.dev.teste.spring.services.excepions.ResourceNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj= repository.findById(id);
        return obj.orElseThrow(() ->new ResourceNotFountException(id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public User update(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateDate(entity, obj);
        return repository.save(entity);
    }

    private void updateDate(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }
}
