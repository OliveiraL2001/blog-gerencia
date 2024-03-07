public class CreateNewPostUseCase {
    private final PostRepository postRepository;

    public CreateNewPostUseCase(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post execute(User author, String title, String content) {

        Post newPost = new Post(UUID.randomUUID(), title, content, author, new Date());
        postRepository.save(newPost);
        return newPost;
    }
}
