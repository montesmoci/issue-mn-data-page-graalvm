package issue.mn.data.page.graalvm;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface BookRepository extends PageableRepository<Book, Long> {
}
