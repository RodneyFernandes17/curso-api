package ausy.pt.api.services;

import ausy.pt.api.domain.User;
import ausy.pt.api.domain.dto.UserDTO;
import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete (Integer id);
}
