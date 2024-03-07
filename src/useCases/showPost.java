public class ShowPostUseCase {
    private final PostRepository postRepository;

    public ShowPostUseCase(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Optional<Post> execute(Long postId) {
        return postRepository.findById(postId);
    }
}
