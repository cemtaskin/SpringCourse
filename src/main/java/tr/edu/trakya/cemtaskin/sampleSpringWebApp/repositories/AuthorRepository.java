package tr.edu.trakya.cemtaskin.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}

