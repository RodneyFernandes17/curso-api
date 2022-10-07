package ausy.pt.api.services.impl;

import ausy.pt.api.domain.User;
import ausy.pt.api.repositories.UserRepository;
import ausy.pt.api.services.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);

    }
}
