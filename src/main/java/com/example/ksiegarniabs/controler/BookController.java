package com.example.ksiegarniabs.controler;

import com.example.ksiegarniabs.entity.Ksiazka;
import com.example.ksiegarniabs.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    //@RequestMapping("/list")
    @GetMapping("/list")
    public String listBook(Model model) {
        List<Ksiazka> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "bookslist";
    }
    @GetMapping("/formadd")
    public String addForm(Model model)
    {
        Ksiazka book = new Ksiazka();
        model.addAttribute("book",book);
        return "addbookform";
    }
    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Ksiazka ksiazka)
    {
        bookService.saveBook(ksiazka);
        return "redirect:/books/list";
    }
}