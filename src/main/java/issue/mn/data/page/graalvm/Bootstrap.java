package issue.mn.data.page.graalvm;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("bootstrap")
public class Bootstrap {

    private List<Map> books;

    private final BookRepository bookRepository;

    public Bootstrap(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener
    public void devData(ServerStartupEvent event) {
        books.forEach(map -> bookRepository.save(new Book((String) map.get("author"), (String) map.get("title"))));
    }

    public void setBooks(List<Map> books) {
        this.books = books;
    }
}
