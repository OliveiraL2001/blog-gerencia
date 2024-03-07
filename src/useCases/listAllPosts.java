public class ListAllPostsUseCase {
    private final PostRepository postRepository;

    public ListAllPostsUseCase(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> execute() {
        return postRepository.findAll();
    }
}
