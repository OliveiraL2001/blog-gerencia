public interface UserRepository {
    void save(User user);
    User findById(UUID userId);
    List<User> findAll();
}
