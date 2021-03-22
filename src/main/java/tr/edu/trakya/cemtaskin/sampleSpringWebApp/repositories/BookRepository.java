package tr.edu.trakya.cemtaskin.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
