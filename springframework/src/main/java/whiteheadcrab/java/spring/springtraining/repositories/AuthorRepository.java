package whiteheadcrab.java.spring.springtraining.repositories;

import org.springframework.data.repository.CrudRepository;
import whiteheadcrab.java.spring.springtraining.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>
{

}
