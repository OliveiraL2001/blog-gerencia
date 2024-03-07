import java.util.UUID;
import java.util.List;

public class User {
    private final UUID userId;
    private final String username;
    private final String email;
    private final String password;
    private final String nickname;
    private final List<Post> posts;

    public User(UUID userId, String username, String email, String password, String nickname, List<Post> posts) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.posts = posts;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
