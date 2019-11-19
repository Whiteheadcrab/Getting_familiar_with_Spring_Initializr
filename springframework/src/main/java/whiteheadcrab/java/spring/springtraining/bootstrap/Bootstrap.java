package whiteheadcrab.java.spring.springtraining.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import whiteheadcrab.java.spring.springtraining.model.Author;
import whiteheadcrab.java.spring.springtraining.model.Book;
import whiteheadcrab.java.spring.springtraining.repositories.AuthorRepository;
import whiteheadcrab.java.spring.springtraining.repositories.BookRepository;


@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent>
{
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    //Inputing data into our h2 data base
    private void initData()
    {
        //Author Adward + Adward's book
        Author adward = new Author("Adward","Kriel");
        Book adwbook = new Book("How to rise","1234","Harpies claws");
        adward.getBooks().add(adwbook);
        adwbook.getAuthors().add(adward);

        authorRepository.save(adward);
        bookRepository.save(adwbook);

        //Author Anna + Anna's book
        Author anna = new Author("Anna","Fligel");
        Book annbook = new Book("Creating freetime","23444","Homemaking iso");
        anna.getBooks().add(annbook);

        authorRepository.save(anna);
        bookRepository.save(annbook);
    }
}
