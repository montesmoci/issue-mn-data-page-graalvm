package issue.mn.data.page.graalvm;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class BookDTO {

    private Long id;
    private String author;
    private String title;

    public BookDTO(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
