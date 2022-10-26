package ausy.pt.api.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String email;
    private String password;
}
