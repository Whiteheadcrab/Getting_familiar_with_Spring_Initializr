package whiteheadcrab.java.spring.springtraining.repositories;

import org.springframework.data.repository.CrudRepository;
import whiteheadcrab.java.spring.springtraining.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{

}
