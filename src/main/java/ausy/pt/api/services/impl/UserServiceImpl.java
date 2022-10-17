package ausy.pt.api.services.impl;

import ausy.pt.api.domain.User;
import ausy.pt.api.domain.dto.UserDTO;
import ausy.pt.api.repositories.UserRepository;
import ausy.pt.api.services.UserService;
import ausy.pt.api.services.exceptions.DataIntegratyViolationException;
import ausy.pt.api.services.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, User.class));
    }

    @Override
    public User update(UserDTO obj) {
        return repository.save(mapper.map(obj, User.class));
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);

    }

    private void findByEmail(UserDTO obj){

        Optional <User> user = repository.findByEmail(obj.getEmail());
        if(user.isPresent() && user.get().getId().equals(obj.getId())){
            throw new DataIntegratyViolationException("Email já cadastrado!");
        }
    }
}
