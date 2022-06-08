package com.example.playinginthespring.Controller;

import com.example.playinginthespring.Entity.Book;
import com.example.playinginthespring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/")
public class BookController {

    @Autowired
    BookService bookService;


    @RequestMapping("/books")
    public List<Book> books(){
        return bookService.getBooks();
    }

    @PostMapping("/add")
    public void add(@RequestBody Book book){
        bookService.addBook(book);
    }

}
