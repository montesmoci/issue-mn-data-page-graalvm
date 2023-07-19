package issue.mn.data.page.graalvm;

import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Singleton;

@Singleton
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Page<BookDTO> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable).map(book -> new BookDTO(book.getAuthor(), book.getTitle()));
    }
}
