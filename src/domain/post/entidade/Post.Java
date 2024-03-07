import java.util.UUID;
import java.util.Date;

public class Post {
    private final UUID postId;
    private final String title;
    private final String content;
    private final User author;
    private final Date datePosted;

    public Post(UUID postId, String title, String content, User author) {
        this.postId = postId;
        this.title = title.length() > 50 ? title.substring(0, 50) : title; 
        this.content = content.length() > 250 ? content.substring(0, 250) : content; 
        this.author = author;
        this.datePosted = new Date();
    }

    public UUID getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getDatePosted() {
        return datePosted;
    }
}
