package whiteheadcrab.java.spring.springtraining.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import whiteheadcrab.java.spring.springtraining.model.Author;
import whiteheadcrab.java.spring.springtraining.model.Book;
import whiteheadcrab.java.spring.springtraining.model.Publisher;
import whiteheadcrab.java.spring.springtraining.repositories.AuthorRepository;
import whiteheadcrab.java.spring.springtraining.repositories.BookRepository;
import whiteheadcrab.java.spring.springtraining.repositories.PublisherRepository;


@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent>
{
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    //Inputing data into our h2 data base
    private void initData()
    {
        Publisher publisher = new Publisher();
        publisher.setName("pub");

        publisherRepository.save(publisher);

        //Author Adward + Adward's book
        Author adward = new Author("Adward","Kriel");
        Book adwbook = new Book("How to rise",publisher,"1234");
        adward.getBooks().add(adwbook);
        adwbook.getAuthors().add(adward);

        authorRepository.save(adward);
        bookRepository.save(adwbook);

        //Author Anna + Anna's book
        Author anna = new Author("Anna","Fligel");
        Book annbook = new Book("Creating freetime",publisher,"23444");
        anna.getBooks().add(annbook);

        authorRepository.save(anna);
        bookRepository.save(annbook);
    }
}
