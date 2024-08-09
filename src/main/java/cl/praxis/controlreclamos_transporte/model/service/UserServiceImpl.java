package cl.praxis.controlreclamos_transporte.model.service;
import cl.praxis.controlreclamos_transporte.model.entities.User;
import cl.praxis.controlreclamos_transporte.model.entities.User;
import cl.praxis.controlreclamos_transporte.model.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(User u) {
        return repository.save(u) != null;
    }

    @Override
    public boolean update(User u) {
        return repository.save(u) != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }


}
