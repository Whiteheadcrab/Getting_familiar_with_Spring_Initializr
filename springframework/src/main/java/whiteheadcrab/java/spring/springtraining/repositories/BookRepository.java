package whiteheadcrab.java.spring.springtraining.repositories;

import org.springframework.data.repository.CrudRepository;
import whiteheadcrab.java.spring.springtraining.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>
{

}
