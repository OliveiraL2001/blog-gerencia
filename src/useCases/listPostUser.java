public class ListUserPostsUseCase {
    private final PostRepository postRepository;

    public ListUserPostsUseCase(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> execute(String userNickname) {
        return postRepository.findByUserNickname(userNickname);
    }
}
