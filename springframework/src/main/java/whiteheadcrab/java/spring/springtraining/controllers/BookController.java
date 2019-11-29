package whiteheadcrab.java.spring.springtraining.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import whiteheadcrab.java.spring.springtraining.repositories.BookRepository;

@Controller
public class BookController
{
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBook(Model model)
    {
        model.addAttribute("books",bookRepository.findAll());

        return "books";
    }
}
