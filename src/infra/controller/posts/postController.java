import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    private final CreatePostUseCase createPostUseCase;
    private final ListAllPostsUseCase listAllPostsUseCase;
    private final ListUserPostsUseCase listUserPostsUseCase;
    private final ShowPostUseCase showPostUseCase;

    public PostController(CreatePostUseCase createPostUseCase, ListAllPostsUseCase listAllPostsUseCase,
                          ListUserPostsUseCase listUserPostsUseCase, ShowPostUseCase showPostUseCase) {
        this.createPostUseCase = createPostUseCase;
        this.listAllPostsUseCase = listAllPostsUseCase;
        this.listUserPostsUseCase = listUserPostsUseCase;
        this.showPostUseCase = showPostUseCase;
    }

    @PostMapping("/posts")
    public ResponseEntity<String> createPost(@RequestBody PostDTO postDTO) {
        // Criação de um novo post a partir dos dados fornecidos
        User author = postDTO.getAuthor(); // Supondo que o autor seja fornecido como parte do DTO
        Post newPost = new Post(UUID.randomUUID(), postDTO.getTitle(), postDTO.getContent(), author);
        createPostUseCase.execute(newPost);
        return ResponseEntity.status(HttpStatus.CREATED).body("Post created successfully");
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = listAllPostsUseCase.execute();
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/posts/{userId}")
    public ResponseEntity<List<Post>> getUserPosts(@PathVariable("userId") UUID userId) {
        // Supondo que a lógica para obter os posts de um usuário específico está implementada no caso de uso apropriado
        List<Post> posts = listUserPostsUseCase.execute(userId);
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/posts/{postId}")
    public ResponseEntity<Post> getPost(@PathVariable("postId") UUID postId) {
        Optional<Post> post = showPostUseCase.execute(postId);
        return post.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }
}
