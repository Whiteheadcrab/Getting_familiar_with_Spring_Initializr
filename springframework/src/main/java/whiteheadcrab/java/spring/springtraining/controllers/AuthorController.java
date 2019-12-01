package whiteheadcrab.java.spring.springtraining.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import whiteheadcrab.java.spring.springtraining.repositories.AuthorRepository;

@Controller
public class AuthorController
{
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository)
    {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
