public class PostRepositoryImpl implements PostRepository {
    private final List<Post> posts = new ArrayList<>();

    @Override
    public void save(Post post) {
        posts.add(post);
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(posts);
    }

    @Override
    public List<Post> findByUserNickname(String userNickname) {
        List<Post> userPosts = new ArrayList<>();
        for (Post post : posts) {
            if (post.getAuthor().equals(userNickname)) {
                userPosts.add(post);
            }
        }
        return userPosts;
    }

    @Override
    public Optional<Post> findById(Long postId) {
        for (Post post : posts) {
            if (post.getId().equals(postId)) {
                return Optional.of(post);
            }
        }
        return Optional.empty();
    }
}