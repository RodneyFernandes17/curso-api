package ausy.pt.api.resources;

import ausy.pt.api.domain.User;
import ausy.pt.api.domain.dto.UserDTO;
import ausy.pt.api.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserResourceTest {

    public static final int INDEX = 0;
    private static final Integer ID = 1;
    private static final String NAME = "Rods";
    private static final String EMAIL = "rod@mail.com";
    private static final String PASSWORD = "123";
    public static final String OBJETO_NAO_ENCONTRADO = "Objeto não encontrado";
    public static final String EMAIL_JA_CADASTRADO = "Email já cadastrado!";

    private User user;

    private UserDTO userDTO;

    @InjectMocks
    private UserResource resource;

    @Mock
    private UserServiceImpl service;

    @Mock
    private ModelMapper mapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser() {
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}