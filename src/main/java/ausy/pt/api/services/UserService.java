package ausy.pt.api.services;

import ausy.pt.api.domain.User;
import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
