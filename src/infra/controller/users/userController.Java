import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        // Criação de um novo usuário a partir dos dados fornecidos
        User newUser = new User(UUID.randomUUID(), userDTO.getUsername(), userDTO.getEmail(), userDTO.getPassword(), userDTO.getNickname(), new ArrayList<>());
        createUserUseCase.execute(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }
}
