package tr.edu.trakya.cemtaskin.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
