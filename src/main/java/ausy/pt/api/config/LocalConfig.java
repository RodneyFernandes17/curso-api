package ausy.pt.api.config;


import ausy.pt.api.domain.User;
import ausy.pt.api.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "rodney", "rod@hotmail.com", "123");
        User u2 = new User(null, "luiza", "luiza@hotmail.com", "123");

        repository.saveAll(List.of(u1,u2));
    }
}
