package issue.mn.data.page.graalvm;

import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import javax.validation.Valid;

@Controller("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Get
    @ExecuteOn(TaskExecutors.IO)
    public Page<BookDTO> index(@Valid Pageable pageable) {
        return bookService.findAll(pageable);
    }

}
