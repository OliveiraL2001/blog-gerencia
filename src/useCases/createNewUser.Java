import java.util.UUID;
import java.util.List;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String username, String email, String password, String nickname) {
        // Você pode adicionar validações aqui, por exemplo, verificar se o email já está em uso

        User newUser = new User(UUID.randomUUID(), username, email, password, nickname, new ArrayList<>());
        userRepository.save(newUser);
        return newUser;
    }
}
